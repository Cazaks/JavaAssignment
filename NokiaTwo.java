import java.util.Scanner;

	public class NokiaTwo{

	public static void main(String[] args){


	Scanner input = new Scanner(System.in);

	boolean nokia = true;
	while (nokia){
	String mainMenu = """
	List of menu functions
		press:
		1. Phone book
		2. Messages
		3. Chat
		4. Call register
		5. Tones
		6. Settings
		7. Call divert
		8. Games
		9. Calculator
		10. Reminders
		11. Clock
		12. Profiles
		13. SIM services
		0. Exit
		""";

	String clockMenuOption = """
		Select clock display
		Press:
		1 - Alarm clock
		2 - Clock settings
		3 - Date settings
		4 - Stopwatch
		5 - Countdown timer
		6 - Auto update of date and time
		0 - Back to main menu
		""";

	String messageBox ="""
		Select mesaage menu
		Press:
		1 -  Write messages
		2 - Inbox
		3 - Outbox
		4 - Picture nessages
		5 - Templates
		6 - Smileys
		7 - Message settings
		8 - Info service
		9 - Voice mailbox number
		10 - Service command editor
		0 - Back to main menu
		""";

		String writeMessageMenu = """
				press:
				0: Back to message menu
				""";

			String inboxMenu = """
				press:
				0. Back to message menu
				""";


				String messageSettings = """
					Message settings
					Press:
					1 - Set 1
					2 - Common
					""";

					String set1 = """
					Select set
					Press:
					1 - Message center number
					2 - Messages sent as
					3 - Message validity
					""";

		String phoneBook = """
			PhoneBook
			press;
			1 - Search
			2 - Service Nos.
			3 - Add name
			4 - Erase
			5 - Edit
			6 - Assign tone
			7 - Send b'card
			8 - Options
			9 - Speed dails
			10 - Voice tags
			0 - Back to main menu

			""";
					
					String serviceNosSelect = """
						press:
						0. Return to Phonebook menu
						""";

					String searchSelect = """
						press:
						0. Retur to phonebook menu
						""";


					String addNameMenu = """
						press:
						0. Return to Phonebook menu
						""";

					String eraseSelect = """
						press:
						0. Return to Phonebook menu
						""";

					String editSelect = """
						press:
						0. Return to Phonebook menu
						""";

					String assignToneSelect = """
						press:
						0. Return to Phonebook menu
						""";

					String sendbCardSelection = """
						press:
						0. Return to Phonebook menu
						""";

					String optionMenuSelection = """
						press:
						0. Return to Phonebook menu
						""";

							String options = """
								Options
								press;
								1 - Type of view
								2 - Memory status
								0 - Back to main menu

								""";

									String typeOfViewSelection = """
										press:
										0. Return to option menu selection
										""";

									String MemorystatusSelect = """
										press:
										0. Return to option menu selection
										""";

					String speedDailSelect = """
						press:
						0. Return to Phonebook menu
						""";

					String voictagsMenu = """
						press:
						0. Return to Phonebook menu
						""";

		
										

		String chatOptionSelect = """
			press:
			0. Exist to main menu
				""";

		String callRegister = """
			Call register
			Press:
			1 - Missed calls
			2 - Recieved calls
			3 - Dial numbers
			4 - Erase recent call lists
			5 - Show call duration
			6 - Show call cost
			7 - Call cost settings
			8 - prepaid credit
			0 - Exist to main menu
	
			""";

		String showCallDuration = """
			Select call menu
				press:
				1 - Last call duration
				2 - All calls' duration
				3 - Received calls' duration
				4 - Dialed calls' duration
				5 - Clear timer
				0 - Back to main menu
				""";

		String callCostSettings = """
				Select call cost
				press:
				1 - Call cost limit
				2 - Show costs in
				0 - Back to main menu
				""";

		String showCallCost = """
			Select call cost
				press:
				1 - Last call cost
				2 - All calls' cost
				3 - Clear counters	
				""";
		String tones = """
				Tones
				press:
				1 - Ringing tone
				2 - Ringing tone volume
				3 - Incoming call alert
				4 - Composer
				5 - Message alert tone
				6 - Keypad tones
				7 - Warning and game tones
				8 - Vibrating alert
				9 - Screen saver
				0 - Exist to main menu
				""";

		String securitySettings = """
			Select security settings
				Press:
				1 - Pin code request
				2 - call barring request
				3 - Fixed dialling
				4 - Closed user group
				5 - Phone security
				6 - Change access codes	
				0 - Back to main menu
				""";
		
		String phoneSettings = """
				Select phone settings
				Press:
				1 - Language
				2 - Cell info display
				3 - Welcome note
				4 - Network selection
				5 - Light
				6 - Confirm SIM Service actions
				0 - Back to main menu
				""";
		
		String settings = """
				Settings
				Press:
				1 - Call settings
				2 - Phone settings
				3 - Security settings
				4 - Restore factory settings
				0 - Back to main menu
				""";

		String callDivertSelect = """
				press:
				0. Exist to main menu
				"""; 

		String gameString = """
				press:
				0. Exit to main menu
				"""; 

		String calculatorOption = """
				press:
				0. Exit to main menu
				""";

		String remindersOption = """
				press:
				0. Exit to main menu
				""";

		String profilesOption = """  
				press:
				0. Exist to main menu
				""";
		
		String simServicesMenu = """
				press:
				0. Exit to main menu
				""";


		System.out.println(mainMenu);
		System.out.println("Seelct Menu: ");
		int selectMenu = input.nextInt();

			switch(selectMenu){
		case 0: nokia = false; System.out.println("Exiting phone main menu"); break;
		
		case 1: boolean phoneBookSelection = true;
			while(phoneBookSelection){
			System.out.println(phoneBook);
			System.out.println("Select Menu: ");
			int phoneBookSelect = input.nextInt();
			
			switch(phoneBookSelect){
		case 0: phoneBookSelection = false;
				break;
 	
			case 1: boolean searchMenu = true;
				while(searchMenu){
				System.out.println("Search");
				System.out.println(searchSelect);
				int searchOption = input.nextInt();

				switch(searchOption){
			case 0: searchMenu = false;
				break;
				default: System.out.println("Invalid selection, senter a valid number");	
				if(searchOption <= 0 && searchOption > 1) {
				System.out.println("Invalid selection. Eenter a valid number");
				return;
					}
				}		
				}break;

			case 2: boolean serviceNos = true;
				while(serviceNos){
				System.out.println("Service nos."); 
				System.out.println(serviceNosSelect);
				int serviceNosOption = input.nextInt();

				switch(serviceNosOption){
			case 0: serviceNos = false;
				break;
				default: System.out.println("Invalid selection, senter a valid number");	
				if(serviceNosOption <= 1 && serviceNosOption > 2) {
				System.out.println("Invalid selection. Eenter a valid number");
				return;
					}
				}		
				}break; 

			case 3: boolean addName = true;
				while(addName){
				System.out.println("Add name");
				System.out.println(addNameMenu);
				int addNameOption = input.nextInt();

				switch(addNameOption){
			case 0: addName  = false;
				break;
				default: System.out.println("Invalid selection, senter a valid number");	
				if(addNameOption <= 2 && addNameOption > 3) {
				System.out.println("Invalid selection. Eenter a valid number");
				return;
					}
				}		
				}break; 

			case 4: boolean eraseMenu = true;
				while(eraseMenu){
				System.out.println("Erase"); 
				System.out.println(eraseSelect);
				int eraseOption = input.nextInt();

				switch(eraseOption){
			case 0: eraseMenu  = false;
				break;
				default: System.out.println("Invalid selection, senter a valid number");	
				if(eraseOption <= 3 && eraseOption > 4) {
				System.out.println("Invalid selection. Eenter a valid number");
				return;
					}
				}		
				} break;
				
			case 5: boolean editMenu = true;
				while(editMenu){
				System.out.println("Edit"); 
				System.out.println(editSelect);
				int selectEditOption = input.nextInt();

				switch(selectEditOption){
			case 0: editMenu  = false;
				break;
				default: System.out.println("Invalid selection, senter a valid number");	
				if(selectEditOption <= 4 && selectEditOption > 5) {
				System.out.println("Invalid selection. Eenter a valid number");
				return;
					}
				}		
				} break;

			case 6: boolean assignTone = true;
				while(assignTone){
				System.out.println("Assign tone"); 
				System.out.println(assignToneSelect);
				int selectToneOption = input.nextInt();

				switch(selectToneOption){
			case 0: assignTone = false;
				break;
				default: System.out.println("Invalid selection, senter a valid number");	
				if(selectToneOption  <= 5 && selectToneOption > 6) {
				System.out.println("Invalid selection. Eenter a valid number");
				return;
					}
				}		
				} break;
				
			case 7: boolean sendbCard = true;
				while(sendbCard){ 
				System.out.println("Send b'card"); 
				System.out.println(sendbCardSelection);
				int sendbCardOption = input.nextInt();

				switch(sendbCardOption){
			case 0: sendbCard = false;
				break;
				default: System.out.println("Invalid selection, senter a valid number");	
				if(sendbCardOption <= 6 && sendbCardOption > 7) {
				System.out.println("Invalid selection. Eenter a valid number");
				return;
					}
				}		
				} break;
			
			case 8: boolean optionSelection = true;
				while(optionSelection){
				System.out.println(options);
				System.out.println(optionMenuSelection);
				int optionMenu = input.nextInt();

				switch(optionMenu){
			case 0: optionSelection = false;
				break;
				
				
					case 1:	boolean typeOfView = true;
						while(typeOfView){ 
						System.out.println("Type of view"); 
						System.out.println(typeOfViewSelection);
						int typeOfViewSelect = input.nextInt();
						switch(typeOfViewSelect){

					case 0: typeOfView = false;
						break;
						default: System.out.println("Invalid selection, senter a valid number");	
						if(typeOfViewSelect <= 0 && typeOfViewSelect > 1) {
						System.out.println("Invalid selection. Eenter a valid number");
						return;
							}
						}		
						} break;

					case 2: boolean memoryStatus = true;
						while(memoryStatus){
						System.out.println("Memory status");
						System.out.println(MemorystatusSelect);
						int memoryStatusOption = input.nextInt();
						switch(memoryStatusOption){

					case 0: memoryStatus = false;
						break;
						default: System.out.println("Invalid selection, senter a valid number");	
						if(memoryStatusOption <= 1 && memoryStatusOption > 2) {
						System.out.println("Invalid selection. Eenter a valid number");
						return;
							}
						}		
						} 
						break;
				default: System.out.println("Invalid selection, senter a valid number");	
				if(optionMenu <= 7 && optionMenu > 8) {
				System.out.println("Invalid selection. Eenter a valid number");
				return;
					}
				}		
				} break;


				
			case 9: boolean speedDail = true;
				while(speedDail){
				System.out.println("Speed dail");
				System.out.println(speedDailSelect);
				int speedDailOption = input.nextInt();
				switch(speedDailOption){

			case 0: speedDail = false;
				break;
				default: System.out.println("Invalid selection, senter a valid number");	
				if(speedDailOption <= 8 && speedDailOption > 9) {
				System.out.println("Invalid selection. Eenter a valid number");
				return;
					}
				}		
				} break;
 
			case 10: boolean voiceTag = true;
				while(voiceTag){ 
				System.out.println("Voice tags"); 
				System.out.println(voictagsMenu);
				int voiceTagOption = input.nextInt();
				switch(voiceTagOption){
			
			case 0: voiceTag = false;
				break;
				default: System.out.println("Invalid selection, senter a valid number");	
				if(voiceTagOption <= 9 && voiceTagOption > 10) {
				System.out.println("Invalid selection. Eenter a valid number");
				return;
					}
				}		
				} break;

			default: System.out.println("Invalid number, please enter a valid number");	
			if(phoneBookSelect <= 0 && phoneBookSelect > 10) {
			System.out.println("Invalid number");
			return;
				}		
			}
		
			}break;
	
				
		case 2: boolean messageSelection = true;
			while(messageSelection){
			System.out.println(messageBox);
			System.out.println("Make selection: ");
			int selectMessage = input.nextInt();

			switch(selectMessage){
		case 0: messageSelection = false;
				break;

			case 1: boolean messageMenu = true;
				while(messageMenu){ 
				System.out.println("Write message");
				System.out.println(writeMessageMenu);
				int writeMessageSelection = input.nextInt();
				switch(writeMessageSelection){
			
			case 0: messageMenu = false;
				break;
				default: System.out.println("Invalid selection, senter a valid number");	
				if(writeMessageSelection <= 0 && writeMessageSelection > 1) {
				System.out.println("Invalid selection. Eenter a valid number");
				return;
					}
				}		
				}break; 
				

			case 2: boolean inboxOption = true;
				while(inboxOption){ 
				System.out.println("Inbox"); 
				System.out.println(inboxMenu);
				int inboxSelection = input.nextInt();
				switch(inboxSelection){
			
			case 0: inboxOption = false;
				break;
				default: System.out.println("Invalid selection, senter a valid number");	
				if(inboxSelection <= 1 && inboxSelection > 2) {
				System.out.println("Invalid selection. Eenter a valid number");
				return;
					}
				}		
				}break; 
				
			case 3: System.out.println("Outbox"); break;
			case 4: System.out.println("Picture messages"); break;
			case 5: System.out.println("Templates"); break;
			case 6: System.out.println("Smileys"); break;

			case 7: System.out.println(messageSettings);
				System.out.println("Make selection: ");
				int settingsSelect = input.nextInt();

				String common ="""
					To select common
					Press:
					1 - Delivery reports
					2 - Reply via same centre number
					3 - Character support

					""";

				switch(settingsSelect){
					case 1: System.out.println(set1);
						System.out.println("Make selection: ");
						int set1Select = input.nextInt();
						
						switch(set1Select){
							case 1: System.out.println("Message center number"); break;
							case 2: System.out.println("Messages sent as"); break;
							case 3: System.out.println("Message validity"); break;	
							}break;
						
					case 2: System.out.println(common);
						System.out.println("Make selection: ");
						int commonSelect = input.nextInt();

						switch(commonSelect){
							
							case 1: System.out.println("Delivery report"); break;
							case 2: System.out.println("Reply via same centre number"); break;
							case 3: System.out.println("Character support"); break;	
							}
					
					}break;
 
			case 8: System.out.println("Info service"); break;
			case 9: System.out.println("Voice mail number"); break;
			case 10: System.out.println("Service command editor"); break;
			
			default: System.out.println("Invalid selection, please enter a valid number");	
			  if(selectMessage < 0 && selectMessage > 10) {
				System.out.println("Invalid number, enter a valid option");
				 return;
	}
	}
	}break;
		
					
	case 3:  boolean chatSelect = true;
			while(chatSelect){

		System.out.println("Chat");
		System.out.println(chatOptionSelect);
		int chatOption = input.nextInt();
		switch(chatOption){
		case 0: chatSelect = false;
		break;
		default: System.out.println("Invalid selection, senter a valid number");	
			 if(chatOption <= 2 && chatOption > 3) {
				System.out.println("Invalid selection. Eenter a valid number");
				 return;
			}
	}		
	}break;

	case 4: boolean callRegisterSelection = true;
			while(callRegisterSelection){

	System.out.println(callRegister);
		System.out.println("Make selection: ");
		int registerMenu = input.nextInt();

		switch(registerMenu){
			case 0: callRegisterSelection = false;
			case 1: System.out.println("Missed Calls"); break;
			case 2: System.out.println("Recived calls"); break;
			case 3: System.out.println("Dailed numbers"); break;
			case 4: System.out.println("Erase recent call lists"); break;

			case 5: System.out.println(showCallDuration);
				System.out.println("Seelct call duration option: ");
				int callDurationSelect = input.nextInt();

				switch(callDurationSelect){
						case 1: System.out.println("Last call duration"); break;
						case 2: System.out.println("All calls' duration"); break;
						case 3:	System.out.println("Received calls' duration"); break;
						case 4: System.out.println("Dialed calls' duration"); break;
						case 5: System.out.println("Clear timers"); break;
					}
					break;

			case 6: System.out.println(showCallCost);
				System.out.println("Seelct call cost option: ");
				int callCostSelect = input.nextInt();

				switch(callCostSelect){
						case 1: System.out.println("Last call cost"); break;
						case 2: System.out.println("All calls' cost"); break;
						case 3:	System.out.println("Clear counters"); break;
				}
				break;

			case 7: System.out.println(callCostSettings);
				System.out.println("Seelct call cost settings option: ");
				int costSettings = input.nextInt();
				
				switch(costSettings){
						case 1: System.out.println("Call cost limit"); break;
						case 2: System.out.println("Show costs in"); break;
				}
				break;
			
			case 8: System.out.println("Prepaid credit"); break;
			default: System.out.println("Invalid selection, select a valid number");	
			  if(registerMenu < 0 && registerMenu > 8) {
				System.out.println("Invalid selection, select a valid number");
				 return;
		}
		}
		
		}break;

	case 5: boolean tonesSelection = true;
			while(tonesSelection ){

		System.out.println(tones); 
		System.out.println("Tones select options: ");
		int tonesSelect = input.nextInt();

		switch(tonesSelect){
			case 0: tonesSelection = false;
			case 1: System.out.println("Ringing tone"); break;
			case 2: System.out.println("Ringing tone volume"); break;
			case 3: System.out.println("Incoming call alert"); break;
			case 4: System.out.println("Composer"); break;
			case 5: System.out.println("Message alert tone"); break;
			case 6: System.out.println("Keypad tones"); break;
			case 7: System.out.println("Warning and game tones"); break;
			case 8: System.out.println("Vibrating alert"); break;
			case 9: System.out.println("Screen saver"); break;

			default: System.out.println("Invalid selection, select a valid number");	
			  if(tonesSelect < 0 && tonesSelect > 9) {
				System.out.println("Invalid selection, select a valid number");
				 return;
				}
		
		}
		}break;
		

	case 6: boolean selectSettings = true;
			while(selectSettings){

		System.out.println(settings); 
		System.out.println("Settings selection options: ");
		int settingsSelection = input.nextInt();

			String callSettings = """
				Select call settings
					Press:
					1 - Automatic redial
					2 - Speed dailling
					3 - Call waiting options
					4 - Own number sending
					5 - Phone line in use
					6 - Automatic answer
					""";

		switch (settingsSelection){
			case 0: selectSettings = false;
			case 1: System.out.println(callSettings);
				System.out.println("Seelct call settings options: ");
				int callSettingsOption = input.nextInt();

				switch(callSettingsOption){
						case 1: System.out.println("Automatic redial"); break;
						case 2: System.out.println("Speed dailling"); break;
						case 3: System.out.println("Call waiting options"); break;
						case 4: System.out.println("Own number sending"); break;
						case 5: System.out.println("Phone line in use"); break;
						case 6: System.out.println("Automatic answer"); break;
				}break;
				
		case 2: System.out.println(phoneSettings);
				System.out.println("Seelct phone settings options: ");
				int phoneSettingsOption = input.nextInt();

				switch(phoneSettingsOption){
						case 1: System.out.println("Language"); break;
						case 2: System.out.println("Cell info display"); break;
						case 3: System.out.println("Welcome note"); break;
						case 4: System.out.println("Network selection"); break;
						case 5: System.out.println("Light"); break;
						case 6: System.out.println("Confirm SIM Service actions"); break;
				}break;

		case 3: System.out.println(securitySettings);
				System.out.println("Select security setting options: ");
				int securitySettingOptions = input.nextInt();

				switch(securitySettingOptions){
						case 1: System.out.println("Pin code request"); break;
						case 2: System.out.println("call barring request"); break;
						case 3: System.out.println("Fixed dialling"); break;
						case 4: System.out.println("Closed user group"); break;
						case 5: System.out.println("Phone security"); break;
						case 6: System.out.println("Change access codes"); break;
						}break;
			case 4: System.out.println("Restore factory settings");break;
			

		default: System.out.println("Invalid selection, select a valid number");	
			  if(settingsSelection < 0 && settingsSelection > 4) {
				System.out.println("Invalid selection, select a valid number");
				 return;
				}
		
		}
		}break;
				

	case 7: boolean callDivert = true;
			while(callDivert ){

		System.out.println("Call divert"); 
		System.out.println(callDivertSelect);
		int callDivertOption = input.nextInt();

		switch(callDivertOption){
		case 0: callDivert = false;
		break;
		default: System.out.println("Invalid selection, senter a valid number");	
			  if(callDivertOption <= 6 && callDivertOption > 7) {
				System.out.println("Invalid selection. Eenter a valid number");
				 return;
			}
	}		
	}break;

	case 8: boolean gameOption = true;
			while(gameOption ){

		System.out.println("Games"); 
		System.out.println(gameString);
		int gameSelect = input.nextInt();

		switch(gameSelect){
		case 0: gameOption = false;
		break;
		default: System.out.println("Invalid selection, senter a valid number");	
			  if(gameSelect <= 7 && gameSelect > 8) {
				System.out.println("Invalid selection. Eenter a valid number");
				 return;
			}
	}		
	}break;

	
	case 9:  boolean calculating = true;
			while(calculating){

		System.out.println("Calculator");  
		System.out.println(calculatorOption);
		int calculate = input.nextInt();

		switch(calculate){
		case 0: calculating = false;
		break;
		default: System.out.println("Invalid selection, senter a valid number");	
			  if(calculate <= 8 && calculate > 9) {
				System.out.println("Invalid selection. Eenter a valid number");
				 return;
			}
	}		
	}break;

	case 10: boolean remindersNote = true;
			while(remindersNote){

		System.out.println("Reminders");
		System.out.println(remindersOption);
		int RemindersSelection = input.nextInt();

		switch(RemindersSelection){
		case 0: remindersNote = false;
		break;
		default: System.out.println("Invalid selection, senter a valid number");	
			  if(RemindersSelection <= 8 && RemindersSelection > 9) {
				System.out.println("Invalid selection. Eenter a valid number");
				 return;
			}
	}		
	}break;	
		
	case 11: boolean clockMenu = true;
			while(clockMenu){

		System.out.println(clockMenuOption);
		System.out.println("Select clock options: ");
		int clockOptions = input.nextInt();

		switch(clockOptions){
			case 0: clockMenu = false;
			case 1: System.out.println("Alarm clock"); break;
			case 2: System.out.println("Clock settings"); break;
			case 3: System.out.println("Date settings"); break;
			case 4: System.out.println("Stopwatch"); break;
			case 5: System.out.println("Countdown timer"); break;
			case 6: System.out.println("Auto update of date and time"); break;
			
	
			default: System.out.println("Invalid selection, select a valid number");	
			  if(clockOptions < 0 && clockOptions > 6) {
				System.out.println("Invalid selection, select a valid number");
				 return;
				}
		
		}
		}break;
				
			

	case 12: boolean profilesMenu = true;
			while(profilesMenu){

		System.out.println("Profiles"); 
		System.out.println(profilesOption);
		int profileSelection = input.nextInt();

		switch(profileSelection){
		case 0: profilesMenu = false;
		break;
		default: System.out.println("Invalid selection, senter a valid number");	
			  if(profileSelection <= 11 && profileSelection > 12) {
				System.out.println("Invalid selection. Eenter a valid number");
				 return;
			}
	}		
	}break;	

	case 13:  boolean simService = true;
			while(simService){

		System.out.println("SIM services");
		System.out.println(simServicesMenu);
		int simServiceOption = input.nextInt();

		switch(simServiceOption){
		case 0: simService = false;
		break;
		default: System.out.println("Invalid selection, senter a valid number");	
			  if(simServiceOption <= 12 && simServiceOption > 13) {
				System.out.println("Invalid selection. Eenter a valid number");
				 return;
			}
	}		
	}break;	 

	default: {System.out.println("Invalid input. Enter a valid number"); 
			
		
		}
		break;
		}
	}

}
}
