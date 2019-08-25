<!DOCTYPE html>
<html lang="ja">
<head>
  <meta charset="UTF-8">
  <title>ログイン</title>
  <link href="css/bootstrap.min.css" rel="stylesheet">
  <style>div{padding: 10px;font-size:16px;}</style>
  <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="login.js" charset="utf-8"></script>
</head>

<body>
<!-- Head[Start] -->
<div class=a1>メキシコ</div>

<header>
<p id=title>ログイン画面</p>
</header>
<!-- Head[End] -->

<!-- Main[Start] -->
<!-- ここでselect02.phpにデータを送っている -->
<form method="post" action="select02.php">
  <div class="jumbotron">
    <fieldset id="waku">
      <legend >≪会員ログイン≫</legend>
      <!-- name="xxx" の部分に注目するようにしておいてください🤗 -->
      <label>ログインID（メールアドレス）：<input type="text" name="email"></label><br>
      <label>パスワード：<input type="text" name="password"></label><br>
      <input type="submit" value="ログイン"><br>
    </fieldset>
  </div>
</form>
<a href="register02.php" id=regi>新規会員登録はこちら</a>

<!-- Main[End] -->

</body>

</html>