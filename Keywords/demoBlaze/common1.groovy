package demoBlaze

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI



public class common1 {

	/**
	 * 
	 * @param length
	 * @return 
	 */
	@Keyword(keywordObject='demoBlaze')
	def static generateRandom(int length) {

		String chars = "ABCDEFGHIJKLMNOPQRSTUVWYXZabcdefghijklmnopqrstuvwxzy1234567890"
		Random rand = new Random()

		StringBuilder username = new StringBuilder();


		for(int i=0; i<length; i++) {

			username.append(chars.charAt(rand.nextInt(chars.length())));
		}

		KeywordUtil.logInfo('New Username: ' + username)
		return username.toString();
	}

	/**
	 * 
	 * @param username
	 * @param password
	 */
	@Keyword(keywordObject='demoBlaze')
	def static void logIntoDemoblaze (String username, String password) {

		WebUI.click(findTestObject('Object Repository/Page_Demoblaze_Login/Page_STORE/a_Log in'))

		WebUI.setText(findTestObject('Object Repository/Page_Demoblaze_Login/Page_STORE/input_Username_loginusername'), username)

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_Demoblaze_Login/Page_STORE/input_Password_loginpassword'),
				password)

		WebUI.click(findTestObject('Object Repository/Page_Demoblaze_Login/Page_STORE/button_Log in'))

		WebUI.verifyElementPresent(findTestObject('New Folder/Page_STORE/a_Welcome nurfatinas', [('username') : username]), 0)
		WebUI.closeBrowser()
	}
}