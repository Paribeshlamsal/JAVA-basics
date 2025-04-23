<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php 
    $sub1 = 50;
    $sub2 = 60;
    $sub3 = 50;
    $total = $sub1 + $sub2 + $sub3;
    $per = (($sub1 + $sub2 + $sub3) / 300) * 100;
    if ($per > 90 && $per <= 100) {
        echo ("A+");
    } elseif ($per > 80 ) {
        echo("A
    } elseif ($per > 70 ) {
        echo("B+
    } elseif ($per > 60 ) {
        echo("B
    } elseif ($per > 50 ) {
        echo("C+
    } elseif ($per > 40 ) {
        echo("C");
    } else {
        echo("Failed");
    }
    ?>
</body>
</html>
