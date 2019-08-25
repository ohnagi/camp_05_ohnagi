<?php
//１. POSTデータ取得
//まず前のphpからデーターを受け取る（この受け取ったデータをもとにbindValueと結びつけるため）

$email = $_POST["email"];
$password = $_POST["password"];

//２. DB接続します xxxにDB名を入れます
try {
$pdo = new PDO('mysql:dbname=php02_db;charset=utf8;host=localhost','root','');
} catch (PDOException $e) {
  exit('データベースに接続できませんでした。'.$e->getMessage());
}

//３. 入力されたID(メールアドレス）と一致する人をデータベースから検索し、
//その人の登録パスワードを取得する。
$db_password = "SELECT password FROM php02_db WHERE 'email = $email'";

//４. データベースからデータベースから取得したパスワードと、
//入力されたパスワードが一致したら、ログインを許可する。
if (!isset($_POST['email'])) {
  echo'IDが送信されていません';
} elseif ($email === '') {
  echo'IDが入力されていません';
} elseif ($password === '') {
  echo'パスワードが入力されていません';
} elseif ($password != $db_password) {
  echo'IDとパスワードが一致しません';
} elseif ($password===$db_password){
  header( "Location:./php01/mission01_index.php" ) ;
}

?>
