<?php
	$new_email = $_POST["email"];
	$host = "sql100.byetcluster.com";
	$username = "epiz_21967893";
	$password = "digital201801";
	$dbname = "epiz_21967893_mobacoach";
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