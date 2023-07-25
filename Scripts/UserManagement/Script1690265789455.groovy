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


WebUI.click(findTestObject('Object Repository/Users Management/New Folder/Page_Home Page/div_Utilities'))

WebUI.click(findTestObject('Object Repository/Users Management/New Folder/Page_Home Page/span_Utilities'))

WebUI.click(findTestObject('Object Repository/Users Management/New Folder/Page_Home Page/span_User Management'))

WebUI.click(findTestObject('Object Repository/Users Management/New Folder/Page_Manage User/i_Action_icon fa fa-plus-square fa-2x'))

WebUI.click(findTestObject('Object Repository/Users Management/New Folder/Page_Manage User/i_Force Logout_icon fa fa-times fa-2x'))

WebUI.click(findTestObject('Object Repository/Users Management/New Folder/Page_Manage User/span_Add User'))

WebUI.click(findTestObject('Object Repository/Users Management/New Folder/Page_Manage User/i_User Management Form_icon fa fa-times-cir_4adfb2'))

WebUI.click(findTestObject('Object Repository/Users Management/New Folder/Page_Manage User/div'))

WebUI.click(findTestObject('Object Repository/Users Management/New Folder/Page_Manage User/span_Logout'))

WebUI.click(findTestObject('Object Repository/Users Management/New Folder/Page_Manage User/button_Logout'))

WebUI.closeBrowser()

