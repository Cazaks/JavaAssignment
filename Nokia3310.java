import java.util.Scanner;

	public class Nokia3310{

	public static void main(String[] args){


	Scanner input = new Scanner(System.in);

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
		""";

		String messageBox ="""
			Mesaage
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
			""";

	String clock = """
		Select clock display
		Press:
		1 - Alarm clock
		2 - Clock settings
		3 - Date settings
		4 - Stopwatch
		5 - Countdown timer
		6 - Auto update of date and time
		""";

	System.out.println(mainMenu);
	System.out.println("Seelct Menu: ");
	int selectMenu = input.nextInt();

		String phoneBook = """
			Phone Book
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

			""";

			String options = """
			Options
			press;
			1 - Type of view
			2 - Memory status

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
	
			""";

		String showCallDuration = """
			Select call menu
				press:
				1 - Last call duration
				2 - All calls' duration
				3 - Received calls' duration
				4 - Dialed calls' duration
				5 - Clear timers
				""";

		String callCostSettings = """
				Select call cost
				press:
				1 - Call cost limit
				2 - Show costs in
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
				""";
		
		String settings = """
				Settings
				Press:
				1 - Call settings
				2 - Phone settings
				3 - Security settings
				4 - Restore factory settings
				""";

		switch(selectMenu){
		
		case 1: System.out.println(phoneBook);
			System.out.println("Select Menu: ");
			int phoneBookSelect = input.nextInt();

		switch(phoneBookSelect){
			case 1: System.out.println("Search"); break;
			case 2: System.out.println("Service nos."); break;
			case 3: System.out.println("Add name"); break;
			case 4: System.out.println("Erase"); break;
			case 5: System.out.println("Edit"); break;
			case 6: System.out.println("Assign tone"); break;
			case 7: System.out.println("Send b'card"); break;
			
			case 8: System.out.println(options);
				System.out.println("Seelct Menu: ");
				int optionSelect = input.nextInt();

				switch(optionSelect){
					case 1: System.out.println("Type of view"); break;
					case 2: System.out.println("Memory status"); break;
					}
					break;

			case 9: System.out.println("Speed dail"); break;
			case 10: System.out.println("Voice tags"); break;			
			}
			break;

		case 2: System.out.println(messageBox);
		System.out.println("Make selection: ");
		int selectMessage = input.nextInt();

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

		switch(selectMessage){
			case 1: System.out.println("Write message"); break;
			case 2: System.out.println("Inbox"); break;
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
		}break;
		
	case 3: System.out.println("Chat");
		break;

	case 4: System.out.println(callRegister);
		System.out.println("Make selection: ");
		int registerMenu = input.nextInt();

		switch(registerMenu){
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
		}
		break;

	case 5: System.out.println(tones); 
		System.out.println("Tones select options: ");
		int tonesSelect = input.nextInt();

		switch(tonesSelect){
			case 1: System.out.println("Ringing tone"); break;
			case 2: System.out.println("Ringing tone volume"); break;
			case 3: System.out.println("Incoming call alert"); break;
			case 4: System.out.println("Composer"); break;
			case 5: System.out.println("Message alert tone"); break;
			case 6: System.out.println("Keypad tones"); break;
			case 7: System.out.println("Warning and game tones"); break;
			case 8: System.out.println("Vibrating alert"); break;
			case 9: System.out.println("Screen saver"); break;
		}
		break;

	case 6: System.out.println(settings); 
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
			}break;
				

	case 7: System.out.println("Call divert"); break;

	case 8: System.out.println("Games"); break;

	case 9: System.out.println("Calculator"); break;

	case 10: System.out.println("Reminders"); break;
		
	case 11: System.out.println(clock);
		System.out.println("Select clock options: ");
		int clockOptions = input.nextInt();

		switch(clockOptions){
			case 1: System.out.println("Alarm clock"); break;
			case 2: System.out.println("Clock settings"); break;
			case 3: System.out.println("Date settings"); break;
			case 4: System.out.println("Stopwatch"); break;
			case 5: System.out.println("Countdown timer"); break;
			case 6: System.out.println("Auto update of date and time"); break;
			}break;
			

	case 12: System.out.println("Profiles"); break;

	case 13: System.out.println("SIM services"); break;
		
		
		}

	}


}