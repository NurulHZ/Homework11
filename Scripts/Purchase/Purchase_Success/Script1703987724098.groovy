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

WebUI.click(findTestObject('Purchase_Success/a_Samsung galaxy s6'))

WebUI.click(findTestObject('Purchase_Success/a_Add to cart'))

WebUI.click(findTestObject('Purchase_Success/a_Cart'))

WebUI.click(findTestObject('Purchase_Success/button_Place Order'))

WebUI.setText(findTestObject('Purchase_Success/input_Name_name'), 'Test')

WebUI.setText(findTestObject('Purchase_Success/input_Country_country'), 'Indonesia')

WebUI.setText(findTestObject('Purchase_Success/input_City_city'), 'Jakarta')

WebUI.setText(findTestObject('Purchase_Success/input_Credit card_card'), '0987654321')

WebUI.setText(findTestObject('Purchase_Success/input_Month_month'), '12')

WebUI.setText(findTestObject('Purchase_Success/input_Year_year'), '2024')

WebUI.click(findTestObject('Purchase_Success/button_Purchase'))

WebUI.verifyElementPresent(findTestObject('Purchase_Success/div_Thank you for your purchase    Id 89612_33e910'), 1)

WebUI.delay(5)

