<!DOCTYPE html>
<html lang="ja">
<head>
  <meta charset="UTF-8">
  <title>データ登録</title>
  <link href="css/bootstrap.min.css" rel="stylesheet">
  <style>div{padding: 10px;font-size:16px;}</style>
  <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="login.js" charset="utf-8"></script>
</head>

<body>
<!-- Head[Start] -->
<header>
<p id=title>会員登録画面</p>
</header>
<!-- Head[End] -->

<!-- Main[Start] -->
<!-- ここでinsert02.phpにデータを送っている -->
<form method="post" action="insert02.php">
  <div class="jumbotron">
   <fieldset id="waku">
    <legend>≪会員情報≫</legend>
    <!-- name="xxx" の部分に注目するようにしておいてください🤗 -->
     <label>名前：<input type="text" name="name"></label><br>
     <label>メールアドレス(ログインID)：<input type="text" name="email"></label><br>
     <label>パスワード：<input type="text" name="password"></label><br>
     <input type="submit" value="登録">
    </fieldset>
  </div>
</form>
<!-- Main[End] -->
</body>

</html>