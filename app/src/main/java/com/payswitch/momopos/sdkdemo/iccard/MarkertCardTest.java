package com.payswitch.momopos.sdkdemo.iccard;///**
// * �ͻ������ű�������Ӧ�������Լ�Ӧ�ø��˻�
// */
//
//package com.wpos.sdkdemo.iccard;
//
//import com.anx.Anx;
//import com.anx.annotation.TestCase;
//
//
//public class MarkertCardTest {
//
//	@TestCase(index = 1, msg = "������Կ�������ļ�")
//	public void runTestCase() {
//
//		String PK_1		= "000102030405060708090A0B0C0D0E0F";//�ⲿ��֤1
//
//		Anx.restart();
//		//��ȡ�汾��
//		Anx.senDisplay("80CA0000029F7D");
//		//ѡMF
//		Anx.senDisplay("00A40000023F00SW9000");
//		//����3F00�µ���Կ
//		//д���ⲿ��֤��Կ
//		String Random 	= Anx.senDisplay("0084000008");
//		Random    		= Random.substring(0,Random.length() - 4);
//		String keydata 	= Anx.blockDes("17011100030F0F3300112233445566778899AABBCCDDEEFF", "00113333445566778899AABBCCDDEEFF");
//		String MAC 		= Anx.blockMacNonTel("84D400001C" + keydata, "00113333445566778899AABBCCDDEEFF", Random);
//		Anx.senDisplay("84D400001C" + keydata + MAC.substring(0,8) );
//
//		//д���ڲ���֤��Կ
//		Random 	    = Anx.senDisplay("0084000008");
//		Random    	= Random.substring(0,Random.length() - 4);
//		keydata 	= Anx.blockDes("17011200000F0F3300112233445566778899AABBCCDDEEFF", "00112233445566778899AABBCCDDEEFF");
//		MAC 		= Anx.blockMacNonTel("84D400001C" + keydata, "00112233445566778899AABBCCDDEEFF", Random);
//		Anx.senDisplay("84D400001C" + keydata + MAC.substring(0,8) );
//
//		//�ⲿ��֤
//		Random 	= Anx.senDisplay("0084000008");
//		Random    		= Random.substring(0,Random.length() - 4);
//		keydata 	= Anx.blockMacNonTel(Random, "00112233445566778899AABBCCDDEEFF");
//		Anx.senDisplay("0082000008" + keydata );
//		//����3F01
//		Anx.senDisplay("80E00200183F01000F0F100300A0000006324D4F542E435053414D3031");
//
//		Anx.senDisplay("00A40000023F00SW9000");
//		Anx.senDisplay("00A4000002DF01SW9000");
//		//����DF01�µ���Կ
//		//д���ⲿ��֤��Կ
//		Random 	    = Anx.senDisplay("0084000008");
//		Random    	= Random.substring(0,Random.length() - 4);
//		keydata 	= Anx.blockDes("17011100020F0F3300112233445566778899AABBCCDDEEFF", PK_1);
//		MAC 		= Anx.blockMacNonTel("84D400011C" + keydata, PK_1, Random);
//		Anx.senDisplay("84D400011C" + keydata + MAC.substring(0,8) );
//
//		//д���ڲ���֤��Կ
//		Random 	    = Anx.senDisplay("0084000008");
//		Random    	= Random.substring(0,Random.length() - 4);
//		keydata 	= Anx.blockDes("17011200000F0F3300112233445566778899AABBCCDDEEFF", PK_1);
//		MAC 		= Anx.blockMacNonTel("84D400001C" + keydata, PK_1, Random);
//		Anx.senDisplay("84D400001C" + keydata + MAC.substring(0,8) );
//
//		Random 	= Anx.senDisplay("0084000008");
//		Random    		= Random.substring(0,Random.length() - 4);
//
//		keydata 	= Anx.blockMacNonTel(Random, PK_1);
//		//String MAC 		= Anx.blockMacNonTel("84D400001C" + keydata, PK_1, Random);
//		Anx.senDisplay("0082000008" + keydata );
//		Anx.senDisplay("00A40000026254");
//		Anx.senDisplay("00B0000011");
//
//		Anx.senDisplay("00D60000802000000002000000000000000000000020000000020000000000000000000000200000000200000000000000000000002000000002000000000000000000000020000000020000000000000000000000200000000200000000000000000000002000000002000000000000000000000020000000020000000000000000000000");
//		Anx.senDisplay("00D60080802000000003000000000000000000000020000000020000000000000000000000200000000200000000000000000000002000000002000000000000000000000020000000020000000000000000000000200000000200000000000000000000002000000002000000000000000000000020000000020000000000000000000000");
//		Anx.senDisplay("00D60100802000000004000000000000000000000020000000020000000000000000000000200000000200000000000000000000002000000002000000000000000000000020000000020000000000000000000000200000000200000000000000000000002000000002000000000000000000000020000000020000000000000000000000");
//		Anx.senDisplay("00D60180802000000005000000000000000000000020000000020000000000000000000000200000000200000000000000000000002000000002000000000000000000000020000000020000000000000000000000200000000200000000000000000000002000000002000000000000000000000020000000020000000000000000000000");
//		Anx.senDisplay("00D61780802000000006000000000000000000000020000000020000000000000000000000200000000200000000000000000000002000000002000000000000000000000020000000020000000000000000000000200000000200000000000000000000002000000002000000000000000000000020000000020000000000000000000000");
//		Anx.senDisplay("00B0000080");
//		Anx.senDisplay("00B0008080");
//		Anx.senDisplay("00B0010080");
//		Anx.senDisplay("00B0018080");
//		Anx.senDisplay("00B0178080");
//
//		Anx.senDisplay("00A40000023F00SW9000");
//		Anx.senDisplay("00A4000002DF01SW9000");
//		Anx.senDisplay("00A40000026254");
//		Anx.senDisplay("00B0000011SW6982");
//		Anx.senDisplay("00D60000802000000002000000000000000000000020000000020000000000000000000000200000000200000000000000000000002000000002000000000000000000000020000000020000000000000000000000200000000200000000000000000000002000000002000000000000000000000020000000020000000000000000000000SW6982");
//
//		Anx.restart();
//		Anx.senDisplay("00A40000023F00SW9000");
//		Anx.senDisplay("00A4000002DF01SW9000");
//
//		Random 	= Anx.senDisplay("0084000008");
//		Random    		= Random.substring(0,Random.length() - 4);
//
//		keydata 	= Anx.blockMacNonTel(Random, "00112233445566778899AABBCCDDEEFF");
//		Anx.senDisplay("0082010008" + keydata );
//		Anx.senDisplay("00A40000026253");
//		Anx.senDisplay("00B0000011SW6982");
//
//	}
//
//}
