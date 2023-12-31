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

Mobile.startApplication('/Users/fendrinayoarbarutjitra/Katalon Studio/Final Project Mobile/APK/app-debug.apk', true)

Mobile.verifyElementText(findTestObject('Object Repository/Login/txt_Bank App Demo'), 'Bank App Demo')

Mobile.verifyElementExist(findTestObject('Object Repository/Login/btn_Help'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Login/btn_AppInfo'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Login/input_UsernameLogin'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Login/input_PasswordLogin'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Login/CheckBox_RememberCredentials'), 0)

Mobile.verifyElementVisible(findTestObject('Login/btn_Login'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Login/txt_Dont have a profile'), 'Don\'t have a profile?')

Mobile.verifyElementVisible(findTestObject('Object Repository/Login/btn_CreateAProfile'), 0)

