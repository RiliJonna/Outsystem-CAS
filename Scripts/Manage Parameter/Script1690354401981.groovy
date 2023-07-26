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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://cmiti-tst.outsystemsenterprise.com/AccountingSystem/Login')

WebUI.setText(findTestObject('Object Repository/Manage Parameter/Page_Login/input_LOGIN_Input_Username2'), 'Jonna Rili')

WebUI.setEncryptedText(findTestObject('Object Repository/Manage Parameter/Page_Login/input_LOGIN_Input_Password2'), 'iFGeFYmXIrU6ruIopQUS+w==')

WebUI.click(findTestObject('Object Repository/Manage Parameter/Page_Login/button_Login'))

WebUI.click(findTestObject('Object Repository/Manage Parameter/Page_Home Page/div_Utilities'))

WebUI.click(findTestObject('Object Repository/Manage Parameter/Page_Home Page/div_Utilities_1'))

WebUI.click(findTestObject('Object Repository/Manage Parameter/Page_Home Page/span_Manage Parameter'))

WebUI.click(findTestObject('Object Repository/Manage Parameter/Page_Manage Parameter/i_Labor Day_icon fa fa-pencil-square-o fa-2x'))

WebUI.click(findTestObject('Object Repository/Manage Parameter/Page_EditHoliday/button_Change Date'))

WebUI.click(findTestObject('Object Repository/Manage Parameter/Page_EditHoliday/button_Save'))

WebUI.click(findTestObject('Object Repository/Manage Parameter/Page_EditHoliday/button_OK'))

WebUI.click(findTestObject('Object Repository/Manage Parameter/Page_EditHoliday/i_Calendar event update date_icon fa fa-tim_ee8f7f'))

WebUI.click(findTestObject('Object Repository/Manage Parameter/Page_EditHoliday/button_Back to previous page'))

WebUI.click(findTestObject('Object Repository/Manage Parameter/Page_Manage Parameter/div_Update Cutt-off'))

WebUI.click(findTestObject('Object Repository/Manage Parameter/Page_Manage Parameter/button_Update'))

WebUI.click(findTestObject('Object Repository/Manage Parameter/Page_Manage Parameter/i_Update Cut-Off Date_icon fa fa-times fa-2_fed3b3'))

WebUI.click(findTestObject('Object Repository/Manage Parameter/Page_Manage Parameter/div_Cut-off MonthNo. Of Days'))

WebUI.click(findTestObject('Object Repository/Manage Parameter/Page_Manage Parameter/div_Generic References Group'))

WebUI.click(findTestObject('Object Repository/Manage Parameter/Page_Manage Parameter/div_Approved and Limit'))

WebUI.click(findTestObject('Object Repository/Manage Parameter/Page_Manage Parameter/span_Reference Type'))

WebUI.click(findTestObject('Object Repository/Manage Parameter/Page_Manage Parameter/span_Create Reference'))

WebUI.click(findTestObject('Object Repository/Manage Parameter/Page_Manage Parameter/i_Create Reference Type_icon fa fa-times-ci_690376'))

WebUI.click(findTestObject('Object Repository/Manage Parameter/Page_Manage Parameter/span_Position'))

WebUI.click(findTestObject('Object Repository/Manage Parameter/Page_Manage Parameter/span_Create Position'))

WebUI.click(findTestObject('Object Repository/Manage Parameter/Page_Manage Parameter/i_Create Position_icon fa fa-times-circle fa-2x'))

WebUI.click(findTestObject('Object Repository/Manage Parameter/Page_Manage Parameter/span_Barangay'))

WebUI.click(findTestObject('Object Repository/Manage Parameter/Page_Manage Parameter/button_Create Barangay'))

WebUI.click(findTestObject('Object Repository/Manage Parameter/Page_Manage Parameter/i_Create Barangay_icon fa fa-times-circle fa-2x'))

WebUI.click(findTestObject('Object Repository/Manage Parameter/Page_Manage Parameter/span_City'))

WebUI.click(findTestObject('Object Repository/Manage Parameter/Page_Manage Parameter/span_Create City'))

WebUI.click(findTestObject('Object Repository/Manage Parameter/Page_Manage Parameter/i_Create City_icon fa fa-times-circle fa-2x'))

WebUI.click(findTestObject('Object Repository/Manage Parameter/Page_Manage Parameter/i_Rili,Jonna Administrator_icon fa fa-user fa-2x'))

WebUI.click(findTestObject('Object Repository/Manage Parameter/Page_Manage Parameter/span_Logout'))

WebUI.click(findTestObject('Object Repository/Manage Parameter/Page_Manage Parameter/button_Logout'))

