import java.util.Random;


public class password {
	public static int num = 0;
	public static void create() {
		String character[] = new String[71];
		character[0] = "a";
		character[1] = "b";
		character[2] = "c";
		character[3] = "d";
		character[4] = "e";
		character[5] = "f";
		character[6] = "g";
		character[7] = "h";
		character[8] = "i";
		character[9] = "j";
		character[10] = "k";
		character[11] = "l";
		character[12] = "m";
		character[13] = "n";
		character[14] = "o";
		character[15] = "p";
		character[16] = "q";
		character[17] = "r";
		character[18] = "s";
		character[19] = "t";
		character[20] = "u";
		character[21] = "v";
		character[22] = "w";
		character[23] = "x";
		character[24] = "y";
		character[25] = "z";
		character[26] = "0";
		character[27] = "1";
		character[28] = "2";
		character[29] = "3";
		character[30] = "4";
		character[31] = "5";
		character[32] = "6";
		character[33] = "7";
		character[34] = "8";
		character[35] = "9";
		character[36] = "A";
		character[37] = "B";
		character[38] = "C";
		character[39] = "D";
		character[40] = "E";
		character[41] = "F";
		character[42] = "G";
		character[43] = "H";
		character[44] = "I";
		character[45] = "J";
		character[46] = "K";
		character[47] = "L";
		character[48] = "M";
		character[49] = "N";
		character[50] = "O";
		character[51] = "P";
		character[52] = "Q";
		character[53] = "R";
		character[54] = "S";
		character[55] = "T";
		character[56] = "U";
		character[57] = "V";
		character[58] = "W";
		character[59] = "X";
		character[60] = "Y";
		character[61] = "Z";
		character[62] = "!";
		character[63] = "@";
		character[64] = "#";
		character[65] = "$";
		character[66] = "&";
		character[67] = "_";
		character[68] = "%";
		character[69] = "^";
		
		
		String password = "";
		Random gen = new Random();
		int ten = 0;


		while(ten != num){

			int r = gen.nextInt(69);
			password = password + character[r];
			ten++;
		}
		wifiPassword.newPassword = password;
	}
}
