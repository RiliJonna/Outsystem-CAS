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

WebUI.navigateToUrl('https://cmiti-tst.outsystemsenterprise.com/AccountingSystem/MainPage')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Login/Page_Login/input_LOGIN_Input_Username2'), 'Jonna Rili')

WebUI.setEncryptedText(findTestObject('Object Repository/Login/Page_Login/input_LOGIN_Input_Password2'), 'iFGeFYmXIrU6ruIopQUS+w==')

WebUI.click(findTestObject('Object Repository/Login/Page_Login/button_Login'))

WebUI.click(findTestObject('Object Repository/Manual Entry/Page_Home Page/span_21'))

WebUI.click(findTestObject('Object Repository/Manual Entry/Page_Home Page/div_Accounts_osui-accordion-item__icon osui_cac4c0'))

WebUI.click(findTestObject('Object Repository/Manual Entry/Page_Home Page/div_Journal'))

WebUI.click(findTestObject('Object Repository/Manual Entry/Page_Home Page/a_Manual Entries'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Manual Entry/Page_Manual Entries/select_--Select Transaction--Cash Disbursem_591dd2'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Manual Entry/Page_Manual Entries/select_--Select Unit--Head Office CMIT'), 
    '0', true)

WebUI.setText(findTestObject('Object Repository/Manual Entry/Page_Manual Entries/input_Payee_b5-TextInput'), 'Jacks')

WebUI.click(findTestObject('Object Repository/Manual Entry/Page_Manual Entries/div_Jackson Wang'))

WebUI.setText(findTestObject('Object Repository/Manual Entry/Page_Manual Entries/textarea_Particulars_TextArea_Particulars'), 
    'T')

WebUI.setText(findTestObject('Object Repository/Manual Entry/Page_Manual Entries/textarea_Testin'), 'Testing')

WebUI.click(findTestObject('Object Repository/Manual Entry/Page_Manual Entries/div_Select'))

WebUI.click(findTestObject('Object Repository/Manual Entry/Page_Manual Entries/span_Accrued Income Tax Payable 2-21-214-1'))

WebUI.click(findTestObject('Object Repository/Manual Entry/Page_Manual Entries/button_Add Row'))

WebUI.click(findTestObject('Object Repository/Manual Entry/Page_Manual Entries/button_OK'))

WebUI.setText(findTestObject('Object Repository/Manual Entry/Page_Manual Entries/input_Accrued Income Tax Payable 2-21-214-1_ce51c1'), 
    '100')

WebUI.setText(findTestObject('Object Repository/Manual Entry/Page_Manual Entries/input_This field is required_l5_0-87_0-Inpu_e552a4'), 
    '0')

WebUI.click(findTestObject('Object Repository/Manual Entry/Page_Manual Entries/button_Add Row'))

WebUI.click(findTestObject('Object Repository/Manual Entry/Page_Manual Entries/div_Select'))

WebUI.setText(findTestObject('Object Repository/Manual Entry/Page_Manual Entries/input_No results found_vscomp-search-input'), 
    '1-11-111-1')

WebUI.click(findTestObject('Object Repository/Manual Entry/Page_Manual Entries/input_No results found_vscomp-search-input'))

WebUI.click(findTestObject('Object Repository/Manual Entry/Page_Manual Entries/div_Select'))

WebUI.click(findTestObject('Object Repository/Manual Entry/Page_Manual Entries/span_Cash in Bank - BPI - Demand Deposit (8_836550'))

WebUI.setText(findTestObject('Object Repository/Manual Entry/Page_Manual Entries/input_Cash in Bank - BPI - Demand Deposit (_d2ea01'), 
    '0')

WebUI.setText(findTestObject('Object Repository/Manual Entry/Page_Manual Entries/input_Cash in Bank - BPI - Demand Deposit (_afb5f9'), 
    '100')

WebUI.click(findTestObject('Object Repository/Manual Entry/Page_Manual Entries/button_Post'))

WebUI.click(findTestObject('Object Repository/Manual Entry/Page_Manual Entries/button_OK'))

WebUI.setText(findTestObject('Object Repository/Manual Entry/Page_Manual Entries/input_Account Number_Input_AccountNumber'), 
    '1111111111')

WebUI.click(findTestObject('Object Repository/Manual Entry/Page_Manual Entries/div_Account TitleDebitCredit               _ec68bf'))

WebUI.click(findTestObject('Object Repository/Manual Entry/Page_Manual Entries/div'))

WebUI.click(findTestObject('Object Repository/Manual Entry/Page_Manual Entries/span_Logout'))

WebUI.click(findTestObject('Object Repository/Manual Entry/Page_Manual Entries/button_Logout'))

WebUI.closeBrowser()

