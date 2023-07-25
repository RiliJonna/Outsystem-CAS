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


WebUI.click(findTestObject('Object Repository/Manage Roles/Page_Home Page/div_Utilities'))

WebUI.click(findTestObject('Object Repository/Manage Roles/Page_Home Page/div_Utilities_1'))

WebUI.click(findTestObject('Object Repository/Manage Roles/Page_Home Page/span_Manage Roles'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Manage Roles/Page_Manage Roles/select_Please Select PositionGeneral Accoun_7b558e'), 
    '4', true)

WebUI.click(findTestObject('Object Repository/Manage Roles/Page_Manage Roles/input_Adjustment Enrties_l4-110_0-Checkbox9'))

WebUI.click(findTestObject('Object Repository/Manage Roles/Page_Manage Roles/button_Save'))

WebUI.click(findTestObject('Object Repository/Manage Roles/Page_Manage Roles/span_Accounts'))

WebUI.click(findTestObject('Object Repository/Manage Roles/Page_Manage Roles/div_Adjustments'))

WebUI.click(findTestObject('Object Repository/Manage Roles/Page_Manage Roles/span_Adjustment Entries'))

WebUI.click(findTestObject('Object Repository/Manage Roles/Page_AdjustingEntries/button_OK'))

WebUI.click(findTestObject('Object Repository/Manage Roles/Page_AdjustingEntries/div_Accounts'))

WebUI.click(findTestObject('Object Repository/Manage Roles/Page_AdjustingEntries/span_Adjustments'))

WebUI.click(findTestObject('Object Repository/Manage Roles/Page_AdjustingEntries/span_Adjustment Details'))

WebUI.click(findTestObject('Object Repository/Manage Roles/Page_AdjustingEntriesDetails/div_Accounts'))

WebUI.click(findTestObject('Object Repository/Manage Roles/Page_AdjustingEntriesDetails/div_Accounts'))

WebUI.click(findTestObject('Object Repository/Manage Roles/Page_AdjustingEntriesDetails/div_Report'))

WebUI.click(findTestObject('Object Repository/Manage Roles/Page_AdjustingEntriesDetails/span_Book of Accounts'))

WebUI.switchToWindowTitle('AdjustingEntriesDetails')

WebUI.click(findTestObject('Object Repository/Manage Roles/Page_AdjustingEntriesDetails/span_General Ledger'))

WebUI.switchToWindowTitle('AdjustingEntriesDetails')

WebUI.click(findTestObject('Object Repository/Manage Roles/Page_AdjustingEntriesDetails/div_Report_osui-accordion-item__icon osui-a_d9ee91'))

WebUI.click(findTestObject('Object Repository/Manage Roles/Page_AdjustingEntriesDetails/div_Utilities'))

WebUI.click(findTestObject('Object Repository/Manage Roles/Page_AdjustingEntriesDetails/div_Utilities_1'))

WebUI.click(findTestObject('Object Repository/Manage Roles/Page_AdjustingEntriesDetails/span_User Management'))





