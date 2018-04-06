
public class Auxiliary {

	private int PuntoCorrente = 1;

	private int getPuntoCorrente() {
		return PuntoCorrente;
	}

	private void setPuntoCorrente() {
		PuntoCorrente++;
	}

	public void Presentazione() {
		System.out.println(
				"              ,,                                                                                                              ,,           ,,    ,,");
		System.out.println(
				"  .g8\"\"\"bgd   db                                                                db                  mm                        db         `7MM    db  ");
		System.out.println(
				".dP'     `M                                                                    ;MM:                 MM                                     MM        ");
		System.out.println(
				"dM'       ` `7MM   ,6\"Yb.  ,p6\"bo   ,pW\"Wq.`7MMpMMMb.pMMMb.  ,pW\"Wq.          ,V^MM.    `7MMpMMMb.mmMMmm ,pW\"Wq.`7MMpMMMb.  `7MM  ,pW\"Wq.  MM  `7MM  ");
		System.out.println(
				"MM            MM  8)   MM 6M'  OO  6W'   `Wb MM    MM    MM 6W'   `Wb        ,M  `MM      MM    MM  MM  6W'   `Wb MM    MM    MM 6W'   `Wb MM    MM  ");
		System.out.println(
				"MM.    `7MMF' MM   ,pm9MM 8M       8M     M8 MM    MM    MM 8M     M8        AbmmmqMA     MM    MM  MM  8M     M8 MM    MM    MM 8M     M8 MM    MM  ");
		System.out.println(
				"`Mb.     MM   MM  8M   MM YM.    , YA.   ,A9 MM    MM    MM YA.   ,A9       A'     VML    MM    MM  MM  YA.   ,A9 MM    MM    MM YA.   ,A9 MM    MM  ");
		System.out.println(
				"  `\"bmmmdPY .JMML.`Moo9^Yo.YMbmd'   `Ybmd9'.JMML  JMML  JMML.`Ybmd9'      .AMA.   .AMMA..JMML  JMML.`Mbmo`Ybmd9'.JMML  JMML..JMML.`Ybmd9'.JMML..JMML.");
		System.out.println();
		System.out.println(
				"                ,6*\"*VA.  ,6*\"*VA.                                                                                                                   ");
		System.out.println(
				" __,           dN     V8 dN     V8                                                                                                                   ");
		System.out.println(
				"`7MM   pd*\"*b. `MN.  ,g9 `MN.  ,g9      ,AM M******A'                                                                                                ");
		System.out.println(
				"  MM  (O)   j8  ,MMMMq.   ,MMMMq.      AVMM Y     A'                                                                                                 ");
		System.out.println(
				"  MM      ,;j9 6P   `YMb 6P   `YMb   ,W' MM      A'                                                                                                  ");
		System.out.println("  MM   ,-='    8b    `M9 8b    `M9 ,W'   MM     A'");
		System.out.println(".JMML.Ammmmmmm `MmmmmM9  `MmmmmM9  AmmmmmMMmm  A'");
		System.out.println("                                         MM   A'                   ");
		System.out.println("                                         MM  A' ");

	}

	public void Punto() {
		System.out.println("Punto " + getPuntoCorrente());
		setPuntoCorrente();
	}

		
}
