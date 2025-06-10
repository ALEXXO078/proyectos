 <?php
session_start();

// Verificamos si la sesión está activa
if (!$_SESSION["validar"]) {
    header(header:"location:index.php?action=login");
    exit();
}
?>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>ingresar datos del usuario</title>
    <link rel="stylesheet" href="vista/assets/css/bootstrap.min.css">
    <style>
        body {
            margin: 0;
            padding: 20px;
            background-color:rgb(218, 20, 20);
        }
        .container {
            max-width: 700px;
            background-color: #fff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 2px 4px rgba(255, 10, 10, 0.1);
        }
        .alert {
            margin-bottom: 20px;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2 class="text-center">datos del usuario</h2>

        <!-- Mostrar mensaje si existe -->
        <?php if (isset($_SESSION["mensaje"])): ?>
            <div class="alert alert-info">
                <?php 
                    echo $_SESSION["mensaje"];
                    unset($_SESSION["mensaje"]); // Limpiamos el mensaje después de mostrarlo
                ?>
            </div>
        <?php endif; ?>

        <?php
        // Instanciamos el controlador
        $editar = new MvcControlador();

        // Mostrar el formulario con los datos actuales del usuario
        $editar->editarUsuarioControlador();

        // Procesar la actualización del usuario
        $editar->actualizarUsuarioControlador();
        ?>
    </div>
</body>
</html>
