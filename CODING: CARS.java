package vehicle;
import java.util.Scanner;

public class Cars {
	public static void carBrands(String[] brands)
	{
		for(int i=0; i<brands.length; i++)
		{
			System.out.println(brands[i]+" ");
		}
	}
	static String[] returnBrands() {
		String [] arr=new String[] {"[1] Audi","[2] BMW","[3] Honda","[4] Toyota"};
		return arr;
	}
	static void carModels() {
		Scanner sc=new Scanner(System.in);
		String engineTech,cylinderArrangement, driveTrain;
		double packageIntakeHP,packageIntakeTorque,packageHotColdPipeHP,packageHotColdPipeTorque,
		packageIntercoolerHP,packageIntercoolerTorque,packageDownpipeHP,packageDownpipeTorque,packageCatBackExhaustHP,
		packageCatBackExhaustTorque,packageMidpipeHP,packageMidpipeTorque,packageECUHP,packageECUTorque,packageTotalOutputHP,packageTotalOutputTorque;
		int carMake, carModel;
		
		packageIntakeHP=17;
		packageIntakeTorque=36;
		packageHotColdPipeHP=8;
		packageHotColdPipeTorque=13;
		packageIntercoolerHP=32;
		packageIntercoolerTorque=53;
		packageDownpipeHP=36;
		packageDownpipeTorque=37;
		packageCatBackExhaustHP=14;
		packageCatBackExhaustTorque=22;
		packageMidpipeHP=15;
		packageMidpipeTorque=20;
		packageECUHP=45;
		packageECUTorque=79;
		packageTotalOutputHP=(packageIntakeHP+packageHotColdPipeHP+packageIntercoolerHP+packageDownpipeHP+packageCatBackExhaustHP+packageMidpipeHP+packageECUHP);
		packageTotalOutputTorque=(packageIntakeTorque+packageHotColdPipeTorque+packageIntercoolerTorque+packageDownpipeTorque+packageCatBackExhaustTorque+packageMidpipeTorque+packageECUTorque);
		
		
		String audi01="Audi RS3 Sportback";
		int audi01Yr= 2021;
		String audi01EngineTech="Inline 5-cylinder engine, turbocharged";
		String audi01EngineCode="CZGB";
		double audi01HP=400;
		double audi01Torque=500;
		double audi01MaxRPM=7000;
		String audi01Tansmission="Dual-Clutch Transmission (DCT) with 7-speed S tronic";
		String audi01Drivetrain="Quattro All-Wheel Drive";
		double audi01NetWeight=1575;
		double audi01TopSpeed=250;
		double audi01Acclr=3.8;
		
		String audi02="Audi RS4 Avant";
		int audi02Yr=2019;
		String audi02EngineTech="V6 6-cylinder engine, turbocharged";
		String audi02EngineCode="AVK";
		double audi02HP=450;
		double audi02Torque=600;
		double audi02MaxRPM=6700;
		String audi02Tansmission="Tiptronic with 8-speed";
		String audi02Drivetrain="Quattro All-Wheel Drive";
		double audi02NetWeight=1745;
		double audi02TopSpeed=280;
		double audi02Acclr=4.1;
		
		String audi03="Audi RS6 Avant";
		int audi03Yr=2019;
		String audi03EngineTech="V8 8-cylinder, turbocharged";
		String audi03EngineCode="07L";
		double audi03HP=600;
		double audi03Torque=750;
		double audi03MaxRPM=6250;
		String audi03Transmission="Tiptronic with 8-speed";
		String audi03Drivetrain="Quattro All-Wheel Drive";
		double audi03NetWeight=2075;
		double audi03TopSpeed=250;
		double audi03Acclr=3.6;
			
		String audi04="Audi RS7 Sportback";
		int audi04Yr=2019;
		String audi04EngineTech="V8 8-cylinder, turbocharged";
		String audi04EngineCode="07L";
		double audi04HP=600;
		double audi04Torque=750;
		double audi04MaxRPM=6250;
		String audi04Transmission="Tiptronic with 8-speed";
		String audi04Drivetrain="Quattro All-Wheel Drive";
		double audi04NetWeight=2065;
		double audi04TopSpeed=250;
		double audi04Acclr=3.6;
		
		String bmwM2="BMW M2 Coupe";
		int bmwM2Yr=2017;
		String bmwM2EngineTech="Straight-6, turbocharged";
		String bmwM2EngineCode="S55";
		double bmwM2HP=410;
		double bmwM2Torque=550;
		double bmwM2MaxRPM=7000;
		String bmwM2Transmission="DCT 7-speed";
		String bmwM2Drivetrain="Rear Wheel Drive";
		double bmwM2NetWeight=1575;
		double bmwM2TopSpeed=270;
		double bmwM2Acclr=4.2;
		
		String bmwM3="BMW M3";
		int bmwM3Yr=2016;
		String bmwM3EngineTech="Straight-6, turbocharged";
		String bmwM3EngineCode="S55";
		double bmwM3HP=410;
		double bmwM3Torque=550;
		double bmwM3MaxRPM=7000;
		String bmwM3Transmission="DCT 7-speed";
		String bmwM3Drivetrain="Rear Wheel Drive";
		double bmwM3NetWeight=1675;
		double bmwM3TopSpeed=270;
		double bmwM3Acclr=4.5;
		
		String bmwM4="BMW M4 Coupe";
		int bmwM4Yr=2016;
		String bmwM4EngineTech="Straight-6, turbocharged";
		String bmwM4EngineCode="S55";
		double bmwM4HP=410;
		double bmwM4Torque=550;
		double bmwM4MaxRPM=7000;
		String bmwM4Transmission="DCT 7-speed";
		String bmwM4Drivetrain="Rear Wheel Drive";
		double bmwM4NetWeight=1635;
		double bmwM4TopSpeed=270;
		double bmwM4Acclr=4.4;
		
		String bmwM5="BMW M5";
		int bmwM5Yr=2018;
		String bmwM5EngineTech="V8 8-cylinders, turbocharged";
		String bmwM5EngineCode="S63";
		double bmwM5HP=600;
		double bmwM5Torque=750;
		double bmwM5MaxRPM=5600;
		String bmwM5Transmission="ZF 8-speed";
		String bmwM5Drivetrain="All Wheel Drive";
		double bmwM5NetWeight=1855;
		double bmwM5TopSpeed=300;
		double bmwM5Acclr=3.4;
		
		String fk8="Honda Civic Type-R (FK8)";
		int fk8Yr=2017;
		String fk8EngineTech="Inline-4, turbocharged";
		String fk8EngineCode="K20A";
		double fk8HP=310;
		double fk8Torque=400;
		double fk8MaxRPM=6500;
		String fk8Transmission="Manual 6-speed";
		String fk8Drivetrain="Front Wheel Drive";
		double fk8NetWeight=1390;
		double fk8TopSpeed=272;
		double fk8Acclr=5.8;
		
		String fd2="Honda Civic Type-R (FD2)";
		int fd2Yr=2010;
		String fd2EngineTech="Inline-4, Natural-Aspirated";
		String fd2EngineCode="K20A";
		double fd2HP=222;
		double fd2Torque=215;
		double fd2MaxRPM=8600;
		String fd2Transmission="Manual 6-speed";
		String fd2Drivetrain="Front Wheel Drive";
		double fd2NetWeight=1270;
		double fd2TopSpeed=240;
		double fd2Acclr=6.3;
		
		String yaris="Toyota GR Yaris";
		int yarisYr=2020;
		String yarisEngineTech="Inline-3, turbocharged";
		String yarisEngineCode="G16E-GTS";
		double yarisHP=257;
		double yarisTorque=360;
		double yarisMaxRPM=6500;
		String yarisTransmission="Manual 6-speed";
		String yarisDrivetrain="All Wheel Drive";
		double yarisNetWeight=1280;
		double yarisTopSpeed=230;
		double yarisAcclr=5.5;
		
		String supra="Toyota GR Supra";
		int supraYr=2019;
		String supraEngineTech="Inline-6, turbocharged";
		String supraEngineCode="GTS";
		double supraHP=335;
		double supraTorque=500;
		double supraMaxRPM=5000;
		String supraTransmission="ZF 8-speed";
		String supraDrivetrain="Rear Wheel Drive";
		double supraNetWeight=1570;
		double supraTopSpeed=250;
		double supraAcclr=4.3;
		
		System.out.println("Welcome to EvoClub Tuning Workshop");
		while(true) {
			System.out.println("Please select your car make:");
			String[] arr=returnBrands();
			carBrands(arr);
			carMake=sc.nextInt();
			if(carMake>=5) {
				System.out.println("Input error, please enter the number again");
				continue;
			}
			break;
		}
		if(carMake==1) {
			while(true) {
				System.out.println("Please select your Audi model:");
				String[] carBrand={"[1] RS3","[2] RS4","[3] RS6","[4] RS7"};
				for(String element: carBrand) {
					System.out.println(element);
				}
				carModel=sc.nextInt();
				if(carModel>=5) {
					System.out.println("Input error, please enter the number again");
					continue;
				}
				switch(carModel) {
				case 1:
					System.out.println("Your Car Info:");
					System.out.println(audi01);
					System.out.println("Manufactured Year: "+audi01Yr);
					System.out.println("Engine Tech: "+audi01EngineTech);
					System.out.println("Engine Code: "+audi01EngineCode);
					System.out.println("Engine Max Output(HP): "+audi01HP);
					System.out.println("Engine Max Torque in Nm: "+audi01Torque);
					System.out.println("Engine Max RPM: "+audi01MaxRPM);
					System.out.println("Drivetrain: "+audi01Drivetrain);
					System.out.println("Transmission: "+audi01Tansmission);
					System.out.println("Net Weight: "+audi01NetWeight);
					System.out.println("Top Speed in KM/H: "+audi01TopSpeed+" (Limited)");
					System.out.println("Acceleration: "+audi01Acclr);
					System.out.println();
					System.out.println("---------------------------------------------------------------------");
					System.out.println("|Stage 2 Tuning Package: Torque Performance                         |");
					System.out.println("|Takeda Momentum Cold Air Intake System: "+packageIntakeHP+"HP"+", "+packageIntakeTorque+"Nm             |");
					System.out.println("|Bladerunner Intercooler Hot and Cold Side: "+packageHotColdPipeHP+"HP"+", "+packageHotColdPipeTorque+"Nm           |");
					System.out.println("|Wagner Tuning Competition Intercooler Kit: "+packageIntercoolerHP+"HP"+", "+packageIntercoolerTorque+"Nm          |");
					System.out.println("|Takeda Twisted Steel Down-pipe: "+packageDownpipeHP+"HP"+", "+packageDownpipeTorque+"Nm                     |");
					System.out.println("|Takeda Stainless Steel Cat-Back Exhaust: "+packageCatBackExhaustHP+"HP"+", "+packageCatBackExhaustTorque+"Nm            |");
					System.out.println("|Takeda Twisted Steel Mid-pipe: "+packageMidpipeHP+"HP"+", "+packageMidpipeTorque+"Nm                      |");
					System.out.println("|Hondata Flash Pro ECU: "+packageECUHP+"HP"+", "+packageECUTorque+"Nm                              |");
					System.out.println("|Total Output: "+packageTotalOutputHP+"HP"+", "+packageTotalOutputTorque+"Nm                                     |");
					System.out.println("---------------------------------------------------------------------");
					System.out.println();
					System.out.println("-------------------------------------");
					System.out.println("|Engine Stats and Data after tuning:|");
					double newEngineHP,newEngineTorque;
					newEngineHP=audi01HP+packageTotalOutputHP;
					newEngineTorque=audi01Torque+packageTotalOutputTorque;
					System.out.println("|Tuned Engine Horsepower: "+newEngineHP+"HP"+"   |");
					System.out.println("|Tuned Engine Torque: "+newEngineTorque+"Nm"+"       |" );
					System.out.println("-------------------------------------");
						
				}
				switch(carModel) {
				case 2:
					System.out.println("Your Car Info:");
					System.out.println(audi02);
					System.out.println("Manufactured Year: "+audi02Yr);
					System.out.println("Engine Tech: "+audi02EngineTech);
					System.out.println("Engine Code: "+audi02EngineCode);
					System.out.println("Engine Max Output(HP): "+audi02HP);
					System.out.println("Engine Max Torque in Nm: "+audi02Torque);
					System.out.println("Engine Max RPM: "+audi02MaxRPM);
					System.out.println("Drivetrain: "+audi02Drivetrain);
					System.out.println("Transmission: "+audi02Tansmission);
					System.out.println("Net Weight: "+audi02NetWeight);
					System.out.println("Top Speed in KM/H: "+audi02TopSpeed+" (Limited)");
					System.out.println("Acceleration: "+audi02Acclr);
					System.out.println();
					System.out.println("---------------------------------------------------------------------");
					System.out.println("|Stage 2 Tuning Package: Torque Performance                         |");
					System.out.println("|Takeda Momentum Cold Air Intake System: "+packageIntakeHP+"HP"+", "+packageIntakeTorque+"Nm             |");
					System.out.println("|Bladerunner Intercooler Hot and Cold Side: "+packageHotColdPipeHP+"HP"+", "+packageHotColdPipeTorque+"Nm           |");
					System.out.println("|Wagner Tuning Competition Intercooler Kit: "+packageIntercoolerHP+"HP"+", "+packageIntercoolerTorque+"Nm          |");
					System.out.println("|Takeda Twisted Steel Down-pipe: "+packageDownpipeHP+"HP"+", "+packageDownpipeTorque+"Nm                     |");
					System.out.println("|Takeda Stainless Steel Cat-Back Exhaust: "+packageCatBackExhaustHP+"HP"+", "+packageCatBackExhaustTorque+"Nm            |");
					System.out.println("|Takeda Twisted Steel Mid-pipe: "+packageMidpipeHP+"HP"+", "+packageMidpipeTorque+"Nm                      |");
					System.out.println("|Hondata Flash Pro ECU: "+packageECUHP+"HP"+", "+packageECUTorque+"Nm                              |");
					System.out.println("|Total Output: "+packageTotalOutputHP+"HP"+", "+packageTotalOutputTorque+"Nm                                     |");
					System.out.println("---------------------------------------------------------------------");
					System.out.println();
					System.out.println("-------------------------------------");
					System.out.println("|Engine Stats and Data after tuning:|");
					double newEngineHP,newEngineTorque;
					newEngineHP=audi02HP+packageTotalOutputHP;
					newEngineTorque=audi02Torque+packageTotalOutputTorque;
					System.out.println("|Tuned Engine Horsepower: "+newEngineHP+"HP"+"   |");
					System.out.println("|Tuned Engine Torque: "+newEngineTorque+"Nm"+"       |" );
					System.out.println("-------------------------------------");
					
				}
				switch(carModel) {
				case 3:
					System.out.println("Your Car Info:");
					System.out.println(audi03);
					System.out.println("Manufactured Year: "+audi03Yr);
					System.out.println("Engine Tech: "+audi03EngineTech);
					System.out.println("Engine Code: "+audi03EngineCode);
					System.out.println("Engine Max Output(HP): "+audi03HP);
					System.out.println("Engine Max Torque in Nm: "+audi03Torque);
					System.out.println("Engine Max RPM: "+audi03MaxRPM);
					System.out.println("Drivetrain: "+audi03Drivetrain);
					System.out.println("Transmission: "+audi03Transmission);
					System.out.println("Net Weight: "+audi03NetWeight);
					System.out.println("Top Speed in KM/H: "+audi03TopSpeed+" (Limited)");
					System.out.println("Acceleration: "+audi03Acclr);
					System.out.println();
					System.out.println("---------------------------------------------------------------------");
					System.out.println("|Stage 2 Tuning Package: Torque Performance                         |");
					System.out.println("|Takeda Momentum Cold Air Intake System: "+packageIntakeHP+"HP"+", "+packageIntakeTorque+"Nm             |");
					System.out.println("|Bladerunner Intercooler Hot and Cold Side: "+packageHotColdPipeHP+"HP"+", "+packageHotColdPipeTorque+"Nm           |");
					System.out.println("|Wagner Tuning Competition Intercooler Kit: "+packageIntercoolerHP+"HP"+", "+packageIntercoolerTorque+"Nm          |");
					System.out.println("|Takeda Twisted Steel Down-pipe: "+packageDownpipeHP+"HP"+", "+packageDownpipeTorque+"Nm                     |");
					System.out.println("|Takeda Stainless Steel Cat-Back Exhaust: "+packageCatBackExhaustHP+"HP"+", "+packageCatBackExhaustTorque+"Nm            |");
					System.out.println("|Takeda Twisted Steel Mid-pipe: "+packageMidpipeHP+"HP"+", "+packageMidpipeTorque+"Nm                      |");
					System.out.println("|Hondata Flash Pro ECU: "+packageECUHP+"HP"+", "+packageECUTorque+"Nm                              |");
					System.out.println("|Total Output: "+packageTotalOutputHP+"HP"+", "+packageTotalOutputTorque+"Nm                                     |");
					System.out.println("---------------------------------------------------------------------");
					System.out.println();
					System.out.println("-------------------------------------");
					System.out.println("|Engine Stats and Data after tuning:|");
					double newEngineHP,newEngineTorque;
					newEngineHP=audi03HP+packageTotalOutputHP;
					newEngineTorque=audi03Torque+packageTotalOutputTorque;
					System.out.println("|Tuned Engine Horsepower: "+newEngineHP+"HP"+"  |");
					System.out.println("|Tuned Engine Torque: "+newEngineTorque+"Nm"+"     |" );
					System.out.println("------------------------------------");
				}
				switch(carModel) {
				case 4:
					System.out.println("Your Car Info:");
					System.out.println(audi04);
					System.out.println("Manufactured Year: "+audi04Yr);
					System.out.println("Engine Tech: "+audi04EngineTech);
					System.out.println("Engine Code: "+audi04EngineCode);
					System.out.println("Engine Max Output(HP): "+audi04HP);
					System.out.println("Engine Max Torque in Nm: "+audi04Torque);
					System.out.println("Engine Max RPM: "+audi04MaxRPM);
					System.out.println("Drivetrain: "+audi04Drivetrain);
					System.out.println("Transmission: "+audi04Transmission);
					System.out.println("Net Weight: "+audi04NetWeight);
					System.out.println("Top Speed in KM/H: "+audi04TopSpeed+" (Limited)");
					System.out.println("Acceleration: "+audi04Acclr);
					System.out.println();
					System.out.println("---------------------------------------------------------------------");
					System.out.println("|Stage 2 Tuning Package: Torque Performance                         |");
					System.out.println("|Takeda Momentum Cold Air Intake System: "+packageIntakeHP+"HP"+", "+packageIntakeTorque+"Nm             |");
					System.out.println("|Bladerunner Intercooler Hot and Cold Side: "+packageHotColdPipeHP+"HP"+", "+packageHotColdPipeTorque+"Nm           |");
					System.out.println("|Wagner Tuning Competition Intercooler Kit: "+packageIntercoolerHP+"HP"+", "+packageIntercoolerTorque+"Nm          |");
					System.out.println("|Takeda Twisted Steel Down-pipe: "+packageDownpipeHP+"HP"+", "+packageDownpipeTorque+"Nm                     |");
					System.out.println("|Takeda Stainless Steel Cat-Back Exhaust: "+packageCatBackExhaustHP+"HP"+", "+packageCatBackExhaustTorque+"Nm            |");
					System.out.println("|Takeda Twisted Steel Mid-pipe: "+packageMidpipeHP+"HP"+", "+packageMidpipeTorque+"Nm                      |");
					System.out.println("|Hondata Flash Pro ECU: "+packageECUHP+"HP"+", "+packageECUTorque+"Nm                              |");
					System.out.println("|Total Output: "+packageTotalOutputHP+"HP"+", "+packageTotalOutputTorque+"Nm                                     |");
					System.out.println("---------------------------------------------------------------------");
					System.out.println();
					System.out.println("-------------------------------------");
					System.out.println("|Engine Stats and Data after tuning:|");
					double newEngineHP,newEngineTorque;
					newEngineHP=audi04HP+packageTotalOutputHP;
					newEngineTorque=audi04Torque+packageTotalOutputTorque;
					System.out.println("|Tuned Engine Horsepower: "+newEngineHP+"HP"+"  |");
					System.out.println("|Tuned Engine Torque: "+newEngineTorque+"Nm"+"     |" );
					System.out.println("-------------------------------------");
				}
				break;
			}
		}
			else if(carMake==2) {
				while(true) {
					System.out.println("Please select your BMW model:");
					String[] carBrand={"[1] M2","[2] M3","[3] M4","[4] M5"};
					for(String element: carBrand) {
						System.out.println(element);
					}
					carModel=sc.nextInt();
					if(carModel>=5) {
						System.out.println("Input error, please enter the number again");
						continue;
					}
					switch(carModel) {
					case 1:
						System.out.println("Your car info:");
						System.out.println(bmwM2);
						System.out.println("Manufactured Year: "+bmwM2Yr);
						System.out.println("Engine Tech: "+bmwM2EngineTech);
						System.out.println("Engine Code: "+bmwM2EngineCode);
						System.out.println("Engine Max Output(HP): "+bmwM2HP);
						System.out.println("Engine Max Torque in Nm: "+bmwM2Torque);
						System.out.println("Engine Max RPM: "+bmwM2MaxRPM);
						System.out.println("Drivetrain: "+bmwM2Drivetrain);
						System.out.println("Transmission: "+bmwM2Transmission);
						System.out.println("Net Weight: "+bmwM2NetWeight);
						System.out.println("Top Speed in KM/H: "+bmwM2TopSpeed+" (Limited)");
						System.out.println("Acceleration: "+bmwM2Acclr);
						System.out.println();
						System.out.println("---------------------------------------------------------------------");
						System.out.println("|Stage 2 Tuning Package: Torque Performance                         |");
						System.out.println("|Takeda Momentum Cold Air Intake System: "+packageIntakeHP+"HP"+", "+packageIntakeTorque+"Nm             |");
						System.out.println("|Bladerunner Intercooler Hot and Cold Side: "+packageHotColdPipeHP+"HP"+", "+packageHotColdPipeTorque+"Nm           |");
						System.out.println("|Wagner Tuning Competition Intercooler Kit: "+packageIntercoolerHP+"HP"+", "+packageIntercoolerTorque+"Nm          |");
						System.out.println("|Takeda Twisted Steel Down-pipe: "+packageDownpipeHP+"HP"+", "+packageDownpipeTorque+"Nm                     |");
						System.out.println("|Takeda Stainless Steel Cat-Back Exhaust: "+packageCatBackExhaustHP+"HP"+", "+packageCatBackExhaustTorque+"Nm            |");
						System.out.println("|Takeda Twisted Steel Mid-pipe: "+packageMidpipeHP+"HP"+", "+packageMidpipeTorque+"Nm                      |");
						System.out.println("|Hondata Flash Pro ECU: "+packageECUHP+"HP"+", "+packageECUTorque+"Nm                              |");
						System.out.println("|Total Output: "+packageTotalOutputHP+"HP"+", "+packageTotalOutputTorque+"Nm                                     |");
						System.out.println("---------------------------------------------------------------------");
						System.out.println();
						System.out.println("-------------------------------------");
						System.out.println("|Engine Stats and Data after tuning:|");
						double newEngineHP,newEngineTorque;
						newEngineHP=bmwM2HP+packageTotalOutputHP;
						newEngineTorque=bmwM2Torque+packageTotalOutputTorque;
						System.out.println("|Tuned Engine Horsepower: "+newEngineHP+"HP"+"   |");
						System.out.println("|Tuned Engine Torque: "+newEngineTorque+"Nm"+"       |" );
						System.out.println("-------------------------------------");
							
					}
					switch(carModel) {
					case 2:
						System.out.println("Your car info:");
						System.out.println(bmwM3);
						System.out.println("Manufactured Year: "+bmwM3Yr);
						System.out.println("Engine Tech: "+bmwM3EngineTech);
						System.out.println("Engine Code: "+bmwM3EngineCode);
						System.out.println("Engine Max Output(HP): "+bmwM3HP);
						System.out.println("Engine Max Torque in Nm: "+bmwM3Torque);
						System.out.println("Engine Max RPM: "+bmwM3MaxRPM);
						System.out.println("Drivetrain: "+bmwM3Drivetrain);
						System.out.println("Transmission: "+bmwM3Transmission);
						System.out.println("Net Weight: "+bmwM3NetWeight);
						System.out.println("Top Speed in KM/H: "+bmwM3TopSpeed+" (Limited)");
						System.out.println("Acceleration: "+bmwM3Acclr);
						System.out.println();
						System.out.println("---------------------------------------------------------------------");
						System.out.println("|Stage 2 Tuning Package: Torque Performance                         |");
						System.out.println("|Takeda Momentum Cold Air Intake System: "+packageIntakeHP+"HP"+", "+packageIntakeTorque+"Nm             |");
						System.out.println("|Bladerunner Intercooler Hot and Cold Side: "+packageHotColdPipeHP+"HP"+", "+packageHotColdPipeTorque+"Nm           |");
						System.out.println("|Wagner Tuning Competition Intercooler Kit: "+packageIntercoolerHP+"HP"+", "+packageIntercoolerTorque+"Nm          |");
						System.out.println("|Takeda Twisted Steel Down-pipe: "+packageDownpipeHP+"HP"+", "+packageDownpipeTorque+"Nm                     |");
						System.out.println("|Takeda Stainless Steel Cat-Back Exhaust: "+packageCatBackExhaustHP+"HP"+", "+packageCatBackExhaustTorque+"Nm            |");
						System.out.println("|Takeda Twisted Steel Mid-pipe: "+packageMidpipeHP+"HP"+", "+packageMidpipeTorque+"Nm                      |");
						System.out.println("|Hondata Flash Pro ECU: "+packageECUHP+"HP"+", "+packageECUTorque+"Nm                              |");
						System.out.println("|Total Output: "+packageTotalOutputHP+"HP"+", "+packageTotalOutputTorque+"Nm                                     |");
						System.out.println("---------------------------------------------------------------------");
						System.out.println();
						System.out.println("-------------------------------------");
						System.out.println("|Engine Stats and Data after tuning:|");
						double newEngineHP,newEngineTorque;
						newEngineHP=bmwM3HP+packageTotalOutputHP;
						newEngineTorque=bmwM3Torque+packageTotalOutputTorque;
						System.out.println("Tuned Engine Horsepower: "+newEngineHP+"HP");
						System.out.println("Tuned Engine Torque: "+newEngineTorque+"Nm");
					}
					switch (carModel) {
					case 3:
						System.out.println("Your car info:");
						System.out.println(bmwM4);
						System.out.println("Manufactured Year: "+bmwM4Yr);
						System.out.println("Engine Tech: "+bmwM4EngineTech);
						System.out.println("Engine Code: "+bmwM4EngineCode);
						System.out.println("Engine Max Output(HP): "+bmwM4HP);
						System.out.println("Engine Max Torque in Nm: "+bmwM4Torque);
						System.out.println("Engine Max RPM: "+bmwM4MaxRPM);
						System.out.println("Drivetrain: "+bmwM4Drivetrain);
						System.out.println("Transmission: "+bmwM4Transmission);
						System.out.println("Net Weight: "+bmwM4NetWeight);
						System.out.println("Top Speed in KM/H: "+bmwM4TopSpeed+" (Limited)");
						System.out.println("Acceleration: "+bmwM4Acclr);
						System.out.println();
						System.out.println("---------------------------------------------------------------------");
						System.out.println("|Stage 2 Tuning Package: Torque Performance                         |");
						System.out.println("|Takeda Momentum Cold Air Intake System: "+packageIntakeHP+"HP"+", "+packageIntakeTorque+"Nm             |");
						System.out.println("|Bladerunner Intercooler Hot and Cold Side: "+packageHotColdPipeHP+"HP"+", "+packageHotColdPipeTorque+"Nm           |");
						System.out.println("|Wagner Tuning Competition Intercooler Kit: "+packageIntercoolerHP+"HP"+", "+packageIntercoolerTorque+"Nm          |");
						System.out.println("|Takeda Twisted Steel Down-pipe: "+packageDownpipeHP+"HP"+", "+packageDownpipeTorque+"Nm                     |");
						System.out.println("|Takeda Stainless Steel Cat-Back Exhaust: "+packageCatBackExhaustHP+"HP"+", "+packageCatBackExhaustTorque+"Nm            |");
						System.out.println("|Takeda Twisted Steel Mid-pipe: "+packageMidpipeHP+"HP"+", "+packageMidpipeTorque+"Nm                      |");
						System.out.println("|Hondata Flash Pro ECU: "+packageECUHP+"HP"+", "+packageECUTorque+"Nm                              |");
						System.out.println("|Total Output: "+packageTotalOutputHP+"HP"+", "+packageTotalOutputTorque+"Nm                                     |");
						System.out.println("---------------------------------------------------------------------");
						System.out.println();
						System.out.println("-------------------------------------");
						System.out.println("|Engine Stats and Data after tuning:|");
						double newEngineHP,newEngineTorque;
						newEngineHP=bmwM4HP+packageTotalOutputHP;
						newEngineTorque=bmwM4Torque+packageTotalOutputTorque;
						System.out.println("|Tuned Engine Horsepower: "+newEngineHP+"HP"+"   |");
						System.out.println("|Tuned Engine Torque: "+newEngineTorque+"Nm"+"       |" );
						System.out.println("-------------------------------------");
					}
					switch(carModel) {
					case 4:
						System.out.println("Your car info:");
						System.out.println(bmwM5);
						System.out.println("Manufactured Year: "+bmwM5Yr);
						System.out.println("Engine Tech: "+bmwM5EngineTech);
						System.out.println("Engine Code: "+bmwM5EngineCode);
						System.out.println("Engine Max Output(HP): "+bmwM5HP);
						System.out.println("Engine Max Torque in Nm: "+bmwM5Torque);
						System.out.println("Engine Max RPM: "+bmwM5MaxRPM);
						System.out.println("Drivetrain: "+bmwM5Drivetrain);
						System.out.println("Transmission: "+bmwM5Transmission);
						System.out.println("Net Weight: "+bmwM5NetWeight);
						System.out.println("Top Speed in KM/H: "+bmwM5TopSpeed+" (Limited)");
						System.out.println("Acceleration: "+bmwM5Acclr);
						System.out.println();
						System.out.println("---------------------------------------------------------------------");
						System.out.println("|Stage 2 Tuning Package: Torque Performance                         |");
						System.out.println("|Takeda Momentum Cold Air Intake System: "+packageIntakeHP+"HP"+", "+packageIntakeTorque+"Nm             |");
						System.out.println("|Bladerunner Intercooler Hot and Cold Side: "+packageHotColdPipeHP+"HP"+", "+packageHotColdPipeTorque+"Nm           |");
						System.out.println("|Wagner Tuning Competition Intercooler Kit: "+packageIntercoolerHP+"HP"+", "+packageIntercoolerTorque+"Nm          |");
						System.out.println("|Takeda Twisted Steel Down-pipe: "+packageDownpipeHP+"HP"+", "+packageDownpipeTorque+"Nm                     |");
						System.out.println("|Takeda Stainless Steel Cat-Back Exhaust: "+packageCatBackExhaustHP+"HP"+", "+packageCatBackExhaustTorque+"Nm            |");
						System.out.println("|Takeda Twisted Steel Mid-pipe: "+packageMidpipeHP+"HP"+", "+packageMidpipeTorque+"Nm                      |");
						System.out.println("|Hondata Flash Pro ECU: "+packageECUHP+"HP"+", "+packageECUTorque+"Nm                              |");
						System.out.println("|Total Output: "+packageTotalOutputHP+"HP"+", "+packageTotalOutputTorque+"Nm                                     |");
						System.out.println("---------------------------------------------------------------------");
						System.out.println();
						System.out.println("-------------------------------------");
						System.out.println("|Engine Stats and Data after tuning:|");
						double newEngineHP,newEngineTorque;
						newEngineHP=bmwM5HP+packageTotalOutputHP;
						newEngineTorque=bmwM5Torque+packageTotalOutputTorque;
						System.out.println("|Tuned Engine Horsepower: "+newEngineHP+"HP"+"   |");
						System.out.println("|Tuned Engine Torque: "+newEngineTorque+"Nm"+"      |" );
						System.out.println("-------------------------------------");
					}	
					break;
				 }
			}
			else if(carMake==3) {
				while(true) {
					System.out.println("Please select your Honda model:");
					String[] carBrand={"[1] Honda Civic Type-R FK8","[2] Honda Civic Type-R FD2"};
					for(String element: carBrand) {
						System.out.println(element);
					}
					carModel=sc.nextInt();
					if(carModel>=3) {
						System.out.println("Input error, please enter the number again");
						continue;
					}
					switch(carModel) {
					case 1:
						System.out.println("Your car info:");
						System.out.println(fk8);
						System.out.println("Manufactured Year: "+fk8Yr);
						System.out.println("Engine Tech: "+fk8EngineTech);
						System.out.println("Engine Code: "+fk8EngineCode);
						System.out.println("Engine Max Output(HP): "+fk8HP);
						System.out.println("Engine Max Torque in Nm: "+fk8Torque);
						System.out.println("Engine Max RPM: "+fk8MaxRPM);
						System.out.println("Drivetrain: "+fk8Drivetrain);
						System.out.println("Transmission: "+fk8Transmission);
						System.out.println("Net Weight: "+fk8NetWeight);
						System.out.println("Top Speed in KM/H: "+fk8TopSpeed+" (Limited)");
						System.out.println("Acceleration: "+fk8Acclr);
						System.out.println();
						System.out.println("---------------------------------------------------------------------");
						System.out.println("|Stage 2 Tuning Package: Torque Performance                         |");
						System.out.println("|Takeda Momentum Cold Air Intake System: "+packageIntakeHP+"HP"+", "+packageIntakeTorque+"Nm             |");
						System.out.println("|Bladerunner Intercooler Hot and Cold Side: "+packageHotColdPipeHP+"HP"+", "+packageHotColdPipeTorque+"Nm           |");
						System.out.println("|Wagner Tuning Competition Intercooler Kit: "+packageIntercoolerHP+"HP"+", "+packageIntercoolerTorque+"Nm          |");
						System.out.println("|Takeda Twisted Steel Down-pipe: "+packageDownpipeHP+"HP"+", "+packageDownpipeTorque+"Nm                     |");
						System.out.println("|Takeda Stainless Steel Cat-Back Exhaust: "+packageCatBackExhaustHP+"HP"+", "+packageCatBackExhaustTorque+"Nm            |");
						System.out.println("|Takeda Twisted Steel Mid-pipe: "+packageMidpipeHP+"HP"+", "+packageMidpipeTorque+"Nm                      |");
						System.out.println("|Hondata Flash Pro ECU: "+packageECUHP+"HP"+", "+packageECUTorque+"Nm                              |");
						System.out.println("|Total Output: "+packageTotalOutputHP+"HP"+", "+packageTotalOutputTorque+"Nm                                     |");
						System.out.println("---------------------------------------------------------------------");
						System.out.println();
						System.out.println("-------------------------------------");
						System.out.println("|Engine Stats and Data after tuning:|");
						double newEngineHP,newEngineTorque;
						newEngineHP=fk8HP+packageTotalOutputHP;
						newEngineTorque=fk8Torque+packageTotalOutputTorque;
						System.out.println("|Tuned Engine Horsepower: "+newEngineHP+"HP"+"   |");
						System.out.println("|Tuned Engine Torque: "+newEngineTorque+"Nm"+"       |" );
						System.out.println("-------------------------------------");
					}
					switch(carModel) {
					case 2:
						System.out.println("Your car info:");
						System.out.println(fd2);
						System.out.println("Manufactured Year: "+fd2Yr);
						System.out.println("Engine Tech: "+fd2EngineTech);
						System.out.println("Engine Code: "+fd2EngineCode);
						System.out.println("Engine Max Output(HP): "+fd2HP);
						System.out.println("Engine Max Torque in Nm: "+fd2Torque);
						System.out.println("Engine Max RPM: "+fd2MaxRPM);
						System.out.println("Drivetrain: "+fd2Drivetrain);
						System.out.println("Transmission: "+fd2Transmission);
						System.out.println("Net Weight: "+fd2NetWeight);
						System.out.println("Top Speed in KM/H: "+fd2TopSpeed+" (Limited)");
						System.out.println("Acceleration: "+fd2Acclr);
						System.out.println();
						System.out.println("---------------------------------------------------------------------");
						System.out.println("|Stage 2 Tuning Package: Torque Performance                         |");
						System.out.println("|Takeda Momentum Cold Air Intake System: "+packageIntakeHP+"HP"+", "+packageIntakeTorque+"Nm             |");
						System.out.println("|Bladerunner Intercooler Hot and Cold Side: "+packageHotColdPipeHP+"HP"+", "+packageHotColdPipeTorque+"Nm           |");
						System.out.println("|Wagner Tuning Competition Intercooler Kit: "+packageIntercoolerHP+"HP"+", "+packageIntercoolerTorque+"Nm          |");
						System.out.println("|Takeda Twisted Steel Down-pipe: "+packageDownpipeHP+"HP"+", "+packageDownpipeTorque+"Nm                     |");
						System.out.println("|Takeda Stainless Steel Cat-Back Exhaust: "+packageCatBackExhaustHP+"HP"+", "+packageCatBackExhaustTorque+"Nm            |");
						System.out.println("|Takeda Twisted Steel Mid-pipe: "+packageMidpipeHP+"HP"+", "+packageMidpipeTorque+"Nm                      |");
						System.out.println("|Hondata Flash Pro ECU: "+packageECUHP+"HP"+", "+packageECUTorque+"Nm                              |");
						System.out.println("|Total Output: "+packageTotalOutputHP+"HP"+", "+packageTotalOutputTorque+"Nm                                     |");
						System.out.println("---------------------------------------------------------------------");
						System.out.println();
						System.out.println("-------------------------------------");
						System.out.println("|Engine Stats and Data after tuning:|");
						double newEngineHP,newEngineTorque;
						newEngineHP=fd2HP+packageTotalOutputHP;
						newEngineTorque=fd2Torque+packageTotalOutputTorque;
						System.out.println("|Tuned Engine Horsepower: "+newEngineHP+"HP"+"   |");
						System.out.println("|Tuned Engine Torque: "+newEngineTorque+"Nm"+"       |" );
						System.out.println("-------------------------------------");
						}
					break;
				}
			}
			else if(carMake==4) {
				while(true) {
					System.out.println("Please select your Toyota model:");
					String[] carBrand={"[1] GR Yaris", "[2] GR Supra"};
					for(String element: carBrand) {
						System.out.println(element);
					}
					carModel=sc.nextInt();
					if(carModel>=3) {
						System.out.println("Input error, please enter the number again");
						continue;
					}
					switch(carModel) {
					case 1:
						System.out.println("Your car info:");
						System.out.println(yaris);
						System.out.println("Manufactured Year: "+yarisYr);
						System.out.println("Engine Tech: "+yarisEngineTech);
						System.out.println("Engine Code: "+yarisEngineCode);
						System.out.println("Engine Max Output(HP): "+yarisHP);
						System.out.println("Engine Max Torque in Nm: "+yarisTorque);
						System.out.println("Engine Max RPM: "+yarisMaxRPM);
						System.out.println("Drivetrain: "+yarisDrivetrain);
						System.out.println("Transmission: "+yarisTransmission);
						System.out.println("Net Weight: "+yarisNetWeight);
						System.out.println("Top Speed in KM/H: "+yarisTopSpeed+" (Limited)");
						System.out.println("Acceleration: "+yarisAcclr);
						System.out.println();
						System.out.println("---------------------------------------------------------------------");
						System.out.println("|Stage 2 Tuning Package: Torque Performance                         |");
						System.out.println("|Takeda Momentum Cold Air Intake System: "+packageIntakeHP+"HP"+", "+packageIntakeTorque+"Nm             |");
						System.out.println("|Bladerunner Intercooler Hot and Cold Side: "+packageHotColdPipeHP+"HP"+", "+packageHotColdPipeTorque+"Nm           |");
						System.out.println("|Wagner Tuning Competition Intercooler Kit: "+packageIntercoolerHP+"HP"+", "+packageIntercoolerTorque+"Nm          |");
						System.out.println("|Takeda Twisted Steel Down-pipe: "+packageDownpipeHP+"HP"+", "+packageDownpipeTorque+"Nm                     |");
						System.out.println("|Takeda Stainless Steel Cat-Back Exhaust: "+packageCatBackExhaustHP+"HP"+", "+packageCatBackExhaustTorque+"Nm            |");
						System.out.println("|Takeda Twisted Steel Mid-pipe: "+packageMidpipeHP+"HP"+", "+packageMidpipeTorque+"Nm                      |");
						System.out.println("|Hondata Flash Pro ECU: "+packageECUHP+"HP"+", "+packageECUTorque+"Nm                              |");
						System.out.println("|Total Output: "+packageTotalOutputHP+"HP"+", "+packageTotalOutputTorque+"Nm                                     |");
						System.out.println("---------------------------------------------------------------------");
						System.out.println();
						System.out.println("-------------------------------------");
						System.out.println("|Engine Stats and Data after tuning:|");
						double newEngineHP,newEngineTorque;
						newEngineHP=yarisHP+packageTotalOutputHP;
						newEngineTorque=yarisTorque+packageTotalOutputTorque;
						System.out.println("|Tuned Engine Horsepower: "+newEngineHP+"HP"+"   |");
						System.out.println("|Tuned Engine Torque: "+newEngineTorque+"Nm"+"       |" );
						System.out.println("-------------------------------------");
					}
					switch(carModel) {
					case 2:
						System.out.println("Your car info:");
						System.out.println(supra);
						System.out.println("Manufactured Year: "+supraYr);
						System.out.println("Engine Tech: "+supraEngineTech);
						System.out.println("Engine Code: "+supraEngineCode);
						System.out.println("Engine Max Output(HP): "+supraHP);
						System.out.println("Engine Max Torque in Nm: "+supraTorque);
						System.out.println("Engine Max RPM: "+supraMaxRPM);
						System.out.println("Drivetrain: "+supraDrivetrain);
						System.out.println("Transmission: "+supraTransmission);
						System.out.println("Net Weight: "+supraNetWeight);
						System.out.println("Top Speed in KM/H: "+supraTopSpeed+" (Limited)");
						System.out.println("Acceleration: "+supraAcclr);
						System.out.println();
						System.out.println("---------------------------------------------------------------------");
						System.out.println("|Stage 2 Tuning Package: Torque Performance                         |");
						System.out.println("|Takeda Momentum Cold Air Intake System: "+packageIntakeHP+"HP"+", "+packageIntakeTorque+"Nm             |");
						System.out.println("|Bladerunner Intercooler Hot and Cold Side: "+packageHotColdPipeHP+"HP"+", "+packageHotColdPipeTorque+"Nm           |");
						System.out.println("|Wagner Tuning Competition Intercooler Kit: "+packageIntercoolerHP+"HP"+", "+packageIntercoolerTorque+"Nm          |");
						System.out.println("|Takeda Twisted Steel Down-pipe: "+packageDownpipeHP+"HP"+", "+packageDownpipeTorque+"Nm                     |");
						System.out.println("|Takeda Stainless Steel Cat-Back Exhaust: "+packageCatBackExhaustHP+"HP"+", "+packageCatBackExhaustTorque+"Nm            |");
						System.out.println("|Takeda Twisted Steel Mid-pipe: "+packageMidpipeHP+"HP"+", "+packageMidpipeTorque+"Nm                      |");
						System.out.println("|Hondata Flash Pro ECU: "+packageECUHP+"HP"+", "+packageECUTorque+"Nm                              |");
						System.out.println("|Total Output: "+packageTotalOutputHP+"HP"+", "+packageTotalOutputTorque+"Nm                                     |");
						System.out.println("---------------------------------------------------------------------");
						System.out.println();
						System.out.println("-------------------------------------");
						System.out.println("|Engine Stats and Data after tuning:|");
						double newEngineHP,newEngineTorque;
						newEngineHP=supraHP+packageTotalOutputHP;
						newEngineTorque=supraTorque+packageTotalOutputTorque;
						System.out.println("|Tuned Engine Horsepower: "+newEngineHP+"HP"+"   |");
						System.out.println("|Tuned Engine Torque: "+newEngineTorque+"Nm"+"       |" );
						System.out.println("-------------------------------------");
					}
					break;
				}
			
			
			}
	}
	static void etMethod() {
		Scanner sc=new Scanner(System.in);
		double HP, netWeightPound,netWeightKg,timeQtrMile,speedFinishQtrMile;
		System.out.println();
		System.out.println("The Elapsed Time(ET) Method");
		System.out.println("This method uses the vehicle weight and the");
		System.out.println("time(ET) to finish a quarter mile (402.3 meters) on the formula of");
		System.out.println("Enter net weight of the car in kilogram:");
		netWeightKg=sc.nextDouble();
		netWeightPound=netWeightKg*2.20462;
		System.out.println("Enter engine horsepower:");
		HP=sc.nextDouble();
		timeQtrMile=((Math.cbrt(netWeightPound/HP))*5.825);
		System.out.println("Time to finish Quarter Mile(ET): "+(String.format("%.2f",timeQtrMile))+" seconds");	
	}
	static void trapSpeedMethod() {
		Scanner sc=new Scanner(System.in);
		double HP, netWeightPound,netWeightKg,timeQtrMile,speedFinishQtrMile;
		System.out.println();
		System.out.println("The Trap-Speed Method");
		System.out.println("This method uses the vehicle weight and the speed");
		System.out.println("which the vehicle finished a quarter mile (402.3 meters) on the formula of");
		System.out.println("Enter the engine horsepower:");
		HP=sc.nextDouble();
		System.out.println("Enter the net weight of the car in the kilogram:");
		netWeightKg=sc.nextDouble();
		speedFinishQtrMile=((Math.cbrt(HP/netWeightKg))*234);
		System.out.println("Speed when finishing Quarter Mile: "+(String.format("%.2f",speedFinishQtrMile))+"KM/H");
	}
	public static void main(String[] args) {
		String[] arr=returnBrands();
		returnBrands();
		carModels();
		etMethod();
		trapSpeedMethod();
	}

}
