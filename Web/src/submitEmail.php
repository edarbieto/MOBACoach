<?php
	$new_email = $_POST["email"];
	$host = "sql309.epizy.com";
	$username = "epiz_22096928";
	$password = "digital201801";
	$dbname = "epiz_22096928_mobacoach";
	$db = mysql_connect($host, $username, $password);
	if (mysql_error() > "") print mysql_error() . "<br>";
  mysql_select_db($dbname, $db);
  if (mysql_error() > "") print mysql_error() . "<br>";
	$query = "insert into conversiones (email) values ('" . $new_email . "')";
	$result = mysql_query($query);
  if (mysql_error() > "") print mysql_error() . "<br>";
  header('Location: /');
	exit;
?>