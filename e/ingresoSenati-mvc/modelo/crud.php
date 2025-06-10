<?php

# IMPORTAMOS EL MÓDULO DE CONEXIÓN
require_once "conexion.php";

# CLASE GENERAL PARA EL CRUD EXTENDIDA DE LA CLASE CONEXIÓN
class Datos extends Conexion {

    # MÉTODO PARA VERIFICAR SI EL CORREO ELECTRÓNICO YA EXISTE
    public function emailExisteModelo($email, $tabla) {
        $stmt = Conexion::conectar()->prepare("SELECT id FROM $tabla WHERE email = :email");
        $stmt->bindParam(":email", $email, PDO::PARAM_STR);
        $stmt->execute();

        return $stmt->fetch(); // Retorna el registro si existe, o false si no existe
    }

    # MÉTODO PARA EL REGISTRO DE USUARIOS
    public function registroUsuarioModelo($datosModelo, $tabla) {
        // Verificar si el correo electrónico ya existe
        if ($this->emailExisteModelo($datosModelo["email"], $tabla)) {
            return "email_existe"; // Retorna un mensaje indicando que el correo ya está registrado
        }

        // Si el correo no existe, proceder con el registro
        $stmt = Conexion::conectar()->prepare("INSERT INTO $tabla (usuario, nombre, email, password) VALUES (:usuario, :nombre, :email, :password)");

        $stmt->bindParam(":usuario", $datosModelo["usuario"], PDO::PARAM_STR);
        $stmt->bindParam(":nombre", $datosModelo["nombre"], PDO::PARAM_STR);
        $stmt->bindParam(":email", $datosModelo["email"], PDO::PARAM_STR);
        $stmt->bindParam(":password", $datosModelo["password"], PDO::PARAM_STR);

        if ($stmt->execute()) {
            return "success";
        } else {
            return "error";
        }
    }

    # MÉTODO PARA INGRESAR AL SISTEMA
    public function ingresoUsuarioModelo($datosModelo, $tabla) {
        $stmt = Conexion::conectar()->prepare("SELECT usuario, password FROM $tabla WHERE usuario = :usuario");
        $stmt->bindParam(":usuario", $datosModelo["usuario"], PDO::PARAM_STR);
        $stmt->execute();

        return $stmt->fetch();
    }

    # MÉTODO PARA LISTAR LOS REGISTROS EN TABLA
    public function vistaUsuariosModelo($tabla) {
        $stmt = Conexion::conectar()->prepare("SELECT id, usuario, nombre, email, password FROM $tabla");
        $stmt->execute();
        return $stmt->fetchAll();
    }

    # MÉTODO PARA EDITAR USUARIO
    public function editarUsuarioModelo($id, $tabla) {
        $stmt = Conexion::conectar()->prepare("SELECT id, usuario, nombre, email, password FROM $tabla WHERE id = :id");
        $stmt->bindParam(":id", $id, PDO::PARAM_INT);
        $stmt->execute();

        return $stmt->fetch();
    }

    # MÉTODO PARA ACTUALIZAR USUARIO
    public function actualizarUsuarioModelo($datos, $tabla) {
        $stmt = Conexion::conectar()->prepare("UPDATE $tabla SET 
            usuario = :usuario,
            nombre = :nombre,
            email = :email,
            password = :password
            WHERE id = :id");

        $stmt->bindParam(":id", $datos["id"], PDO::PARAM_INT);
        $stmt->bindParam(":usuario", $datos["usuario"], PDO::PARAM_STR);
        $stmt->bindParam(":nombre", $datos["nombre"], PDO::PARAM_STR);
        $stmt->bindParam(":email", $datos["email"], PDO::PARAM_STR);
        $stmt->bindParam(":password", $datos["password"], PDO::PARAM_STR);

        if ($stmt->execute()) {
            return "success";
        } else {
            return "error";
        }
    }

    # MÉTODO PARA BORRAR USUARIO
    public function borrarUsuarioModelo($id, $tabla) {
        $stmt = Conexion::conectar()->prepare("DELETE FROM $tabla WHERE id = :id");
        $stmt->bindParam(":id", $id, PDO::PARAM_INT);

        if ($stmt->execute()) {
            return "success";
        } else {
            return "error";
        }
    }
}
?>
