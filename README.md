ビンゴゲーム概要
---------------------------------------

* マネージャとプレイヤーの対戦で行います。

* マネージャはプレイヤー名が Manager です。

* プレイヤーはゲーム開始時に名前を入力して決定します。

* マネージャは、ビンゴボールを1つずつ取り出し、プレイヤーに通知します。

* プレイヤーは通知されたボールの番号を判別して自分のビンゴカードで一致する番号があると xx に置き換えます。

* ビンゴカードに振られる数字は、以下となります。

	1 列目：1～15
	2 列目：16～30
	3 列目：31～45(真ん中は FreeSpace で xx が設定されています）
	4 列目：46～60
	5 列目：61～75

* マネージャ、またはプレイヤーのどちらかが縦・横・ななめのどれかで xx を 5 つそろえたら bingo となり終了です。

* ゲーム回数は10回までと設定
	→回数制限を設けないと30回やってもビンゴにならない可能性があるため。

* 最初のボール排出前に、まず10玉排出する。
	→ゲーム回数を減らしているため


演習内容
---------------------------------------

* 各パッケージ配下のクラス内で実装が空になっているので埋めてください。

* テストパッケージ(com.foo.training.test) 内のクラスは、下記の修正を行うだけとしてください。


com.foo.training.test パッケージ
---------------------------------------
JUnit テストクラスが配置されています。

このパッケージ配下で以下の作業をしてください。

* BaseBingoPlayerTest クラスにおいて、com.foo.training.bingo.player パッケージ配下で実装した Player クラスのリーチ、ビンゴ時の叫び声を上書きしてください

* data パッケージ配下の HorizontalReachTestValue, VerticalReachTestValue の各クラスでテストケースのデータが不足しているので、補ってください。

上記 2 点以外のコードは修正しないでください。

各テストクラス (BingoPlayerxxxxTest.java) を実行して全てのテストが正常に完了することを確認してください。
