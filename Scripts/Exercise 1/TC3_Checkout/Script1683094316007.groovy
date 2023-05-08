import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Exercise 1/TC2_AddtoCart'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Demoblaze_Checkout/Page_STORE/a_Cart'))

WebUI.click(findTestObject('Page_Demoblaze_Checkout/Page_STORE/button_Place Order'))

WebUI.setText(findTestObject('Page_Demoblaze_Checkout/Page_STORE/input_Name_name'), 'Name')

WebUI.setText(findTestObject('Page_Demoblaze_Checkout/Page_STORE/input_Country_country'), 'Country')

WebUI.setText(findTestObject('Page_Demoblaze_Checkout/Page_STORE/input_City_city'), 'City')

WebUI.setText(findTestObject('Page_Demoblaze_Checkout/Page_STORE/input_Credit card_card'), '1234567891011')

WebUI.setText(findTestObject('Page_Demoblaze_Checkout/Page_STORE/input_Month_month'), '10')

WebUI.setText(findTestObject('Page_Demoblaze_Checkout/Page_STORE/input_Year_year'), '2029')

WebUI.click(findTestObject('Page_Demoblaze_Checkout/Page_STORE/button_Purchase'))

WebUI.verifyElementPresent(findTestObject('Page_Demoblaze_Checkout/Page_STORE/button_Purchase'), 0)

WebUI.click(findTestObject('Page_Demoblaze_Checkout/Page_STORE/button_OK'))

WebUI.closeBrowser()

