/**
 * 
 */

/**
 * @author m.sabiq
 *
 */
public class AES {
	private static final byte[] sBox = {22,30};
	private static final byte[] sBoxInv = {22,30};
	private static final int keySize = 256;
	private static final int rounds = 14;
	private static final byte[] rcj = {1,2};
//	private static final int keySize = 256;
	
	byte[] plainText;
	byte[] key;
	
//	Constructor
	public void AES(byte[] plainText, byte[] key) {
		this.plainText = plainText;
		this.key = key;
	}
	
	public byte[] run(){
		return plainText;

	}
	
	public byte[] addRoundKeyEn(){
		byte[] res = new byte[plainText.length];
		for(int i = 0; i < plainText.length; i++) {
			res[i] = (byte) (plainText[i] ^ key[i]);
		}
		return res;
	}
	
	public byte[] subBytesEn(){
		return plainText;

	}
	
	public byte[] shiftRowsEn(){
		return plainText;

	}
	
	public byte[] mixColEn(){
		return plainText;

	}
}
