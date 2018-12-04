/**************************************************************************
  Who Wants to Be a Millionaire?
  Raphael Academia

  Date: Tuesday, January 24th, 2017

  This program recreates the game show "Who Wants to Be a Millionaire?" with
  a few changes. In the program, Users will be asked 15 multiple choice
  questions that will become increasingly difficult. Each question will be
  worth a certain amount of prize money, with the last question being worth
  the grand prize of $1 000 000. Users must select the right answer by
  inputing either A, B, C, or D. If the user is stuck on a question, they
  will be given the choice to use one of three lifelines, which are all 50/50
  lifelines (which means that two incorrect answers will be removed, leaving
  user with two possible answers).
**************************************************************************/
// The "Culminating" class.
import java.awt.*;
import hsa.Console;

public class Culminating
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	//==========================================================Declaring Variables================================================================
	String[] Cans = new String [15];  //Cans = the right answer
	String Uans1, Uans2, Uans3, Uans4, Uans5, Uans6, Uans7, Uans8, Uans9, Uans10, Uans11, Uans12, Uans13, Uans14, Uans15;    //Uans = what the user inputed
	int lifelineAvail = 0;       //Counter for how many lifelines have been used
	int Gameover = 0;           //Gameover counter that determines whether or not the game should continue



	//==============================================================Intro Screen====================================================================

	c.setColor (Color.black);
	c.fillRect (0, 0, 650, 500);    //Background of intro screen

	Color introBlue = new Color (30, 144, 255);
	c.setColor (introBlue);
	c.drawRect (10, 10, 615, 475);  //Outline of intro screen

	Font introTitle = new Font ("Century Gothic", Font.BOLD, 28);   //Title
	c.setFont (introTitle);
	c.drawString ("Welcome Who Wants To Be a Millionaire!", 45, 70);

	c.setColor (Color.white);
	Font introRules = new Font ("Eras Medium ITC", Font.BOLD, 16); //Rules
	c.setFont (introRules);
	c.drawString ("How to Play", 15, 135);
	c.drawLine (13, 135, 110, 135);
	c.drawString ("1. You will be given the task to answer 15 multiple choice questions that ", 15, 160);
	c.drawString ("will become increasingly difficult. Each question is worth a certain", 36, 175);
	c.drawString ("amount of prize money that increases after each question, with the 15th ", 36, 190);
	c.drawString ("question culminating in the grand prize of $1 000 000", 36, 205);
	c.drawString ("2. You will answer each question by inputing either A, B, C, or D", 15, 230);            //All the rules for the game
	c.drawString ("3. If you are stuck on a question, you can use up to three 50/50 lifelines,", 15, 255);
	c.drawString ("which will remove two incorrect answers. The Lifeline can be utilized", 36, 270);
	c.drawString ("by inputing 'Lifeline'", 36, 285);
	c.drawString ("4. If you input neither A, B, C, D, or Lifeline, the **program will keep", 15, 305);
	c.drawString ("on asking you to input one of the possible choices** (which are A, B, C D,  ", 36, 320);
	c.drawString ("or Lifeline)", 36, 335);
	c.drawString ("5. There is no time limit when answering the questions", 16, 355);

	c.setFont (introTitle);
	c.drawString ("Are you ready to play?", 157, 410);
	c.drawString ("Press any key to start Playing!", 110, 435);

	c.getChar ();
	c.clear ();

	//=============================================================Game Board====================================================================
	//Declaring all the answers for the array
	Cans [0] = "B";
	Cans [1] = "D";
	Cans [2] = "A";
	Cans [3] = "C";
	Cans [4] = "A";
	Cans [5] = "C";
	Cans [6] = "C";
	Cans [7] = "B";
	Cans [8] = "D";
	Cans [9] = "B";
	Cans [10] = "D";
	Cans [11] = "D";





	//=============================================================Game Board====================================================================
	//For some of the graphics code, it is tripled (ex: 3 drawRects) to make the lines thicker


	c.setColor (Color.black);
	c.fillRect (0, 0, 650, 500);
	delay (500);

	Color gameBoardBlue = new Color (71, 165, 220);
	c.setColor (gameBoardBlue);

	c.drawRect (460, 5, 175, 490);
	c.drawRect (461, 6, 175, 490);      //Money + lifeline section
	c.drawRect (462, 7, 175, 490);



	c.drawRect (3, 420, 452, 75);
	c.drawRect (4, 421, 452, 75);       //User interaction
	c.drawRect (5, 422, 452, 75);


	c.setColor (Color.white);
	c.fillRect (6, 423, 449, 72);       //making a white filled rectangle so what the user inputs can be seen

	c.setColor (gameBoardBlue);




	int[] a = {30, 205, 225, 205, 30, 10, 30};
	int[] a1 = {270, 270, 300, 330, 330, 300, 270};      //A Box
	c.drawPolygon (a, a1, 7);

	int[] a2 = {31, 206, 226, 205, 31, 11, 30};
	int[] a3 = {271, 271, 300, 331, 331, 300, 271};
	c.drawPolygon (a2, a3, 7);

	int[] a4 = {32, 207, 227, 205, 32, 12, 30};
	int[] a5 = {272, 272, 300, 332, 332, 300, 272};
	c.drawPolygon (a4, a5, 7);




	int[] b = {255, 430, 450, 430, 255, 235, 255};
	int[] b1 = {270, 270, 300, 330, 330, 300, 270};      //B Box
	c.drawPolygon (b, b1, 7);

	int[] b2 = {256, 431, 451, 430, 256, 236, 255};
	int[] b3 = {271, 271, 300, 331, 331, 300, 271};
	c.drawPolygon (b2, b3, 7);

	int[] b4 = {257, 432, 452, 430, 257, 237, 255};
	int[] b5 = {272, 272, 300, 332, 332, 300, 272};
	c.drawPolygon (b4, b5, 7);




	int[] c2 = {30, 205, 225, 205, 30, 10, 30};          //C Box
	int[] c3 = {345, 345, 375, 405, 405, 375, 345};
	c.drawPolygon (c2, c3, 7);

	int[] c4 = {31, 206, 226, 205, 31, 11, 30};
	int[] c5 = {346, 346, 375, 406, 406, 375, 346};
	c.drawPolygon (c4, c5, 7);

	int[] c6 = {32, 207, 227, 205, 32, 12, 30};
	int[] c7 = {347, 347, 375, 407, 407, 375, 347};
	c.drawPolygon (c6, c7, 7);



	int[] d = {255, 430, 450, 430, 255, 235, 255};      //D Box
	int[] d1 = {345, 345, 375, 405, 405, 375, 345};
	c.drawPolygon (d, d1, 7);

	int[] d2 = {256, 431, 451, 430, 256, 236, 255};
	int[] d3 = {346, 346, 375, 406, 406, 375, 346};
	c.drawPolygon (d2, d3, 7);

	int[] d4 = {257, 432, 452, 430, 257, 237, 255};
	int[] d5 = {347, 347, 375, 407, 407, 375, 347};
	c.drawPolygon (d4, d5, 7);


	c.drawRect (25, 25, 410, 225);                      //Question box
	c.drawRect (26, 26, 410, 225);
	c.drawRect (27, 27, 410, 225);


	Font moneySection = new Font ("Arial", Font.BOLD, 20);          //Money graphics
	c.setFont (moneySection);
	c.setColor (Color.white);
	c.drawString ("1.         $100", 470, 475);
	c.drawString ("2.         $200", 470, 450);
	c.drawString ("3.         $300", 470, 425);
	c.drawString ("4.         $500", 470, 400);
	c.drawString ("5.        $1000", 470, 375);
	c.drawString ("6.        $2000", 470, 350);
	c.drawString ("7.        $4000", 470, 325);
	c.drawString ("8.        $8000", 470, 300);
	c.drawString ("9.      $16 000", 470, 275);
	c.drawString ("10.    $32 000", 470, 250);
	c.drawString ("11.    $64 000", 470, 225);
	c.drawString ("12.    $125 000", 470, 200);
	c.drawString ("13.    $250 000", 470, 175);
	c.drawString ("14.    $500 000", 470, 150);
	c.drawString ("15.  $1 000 000", 470, 125);

	c.setColor (gameBoardBlue);                             //Lifeline graphics
	c.drawOval (467, 30, 50, 50);
	c.drawOval (468, 30, 50, 50);
	c.drawOval (469, 30, 50, 50);



	c.drawOval (525, 30, 50, 50);
	c.drawOval (526, 30, 50, 50);
	c.drawOval (527, 30, 50, 50);



	c.drawOval (580, 30, 50, 50);
	c.drawOval (581, 30, 50, 50);
	c.drawOval (582, 30, 50, 50);


	Font lifelineSection = new Font ("Arial", Font.BOLD, 16);
	c.setFont (lifelineSection);
	c.drawString ("50:50", 473, 62);
	c.drawString ("50:50", 531, 62);
	c.drawString ("50:50", 586, 62);




	Font ABCD = new Font ("Arial", Font.BOLD, 25);           //A B C D
	c.setFont (ABCD);
	c.setColor (Color.yellow);
	c.drawString ("A:", 25, 310);
	c.drawString ("B:", 250, 310);
	c.drawString ("C:", 25, 385);
	c.drawString ("D:", 250, 385);

	Font ABCDsmall = new Font ("Arial", Font.BOLD, 22);



	//=============================================================Questions Code====================================================================

	//=============================================================Questions #1====================================================================

	delay (1000);
	flashNumber (470, 475);                                             //Flashes to indicate that the user is on the first question
	delay (1500);


	Font questionFont = new Font ("Arial", Font.BOLD, 25);
	c.setFont (questionFont);
	c.setColor (Color.white);

	c.drawString ("Which letter comes first in the", 50, 55);          //Code for the first question
	c.drawString ("English Alphabet?", 125, 80);


	listAnswers ("D", "A", "C", "B");

	c.setCursor (22, 2);                                    //Setting cursur to user input

	do                  //error trap
	{
	    int z = 1;
	    c.print ("Please enter A,B,C,D, or Lifeline:");
	    Uans1 = c.readString ();
	    drawMoneySection (470, 475);
	    c.setCursor (22 + z, 2);
	    z++;

	}
	while (!((Uans1.equals ("A")) || (Uans1.equals ("a")) || (Uans1.equals ("B")) || (Uans1.equals ("b")) || (Uans1.equals ("C")) || (Uans1.equals ("c")) || (Uans1.equals ("D")) || (Uans1.equals ("d") || (Uans1.equals ("Lifeline") || (Uans1.equals ("lifeline"))))));

	if ((Uans1.equals ("Lifeline") || (Uans1.equals ("lifeline"))))                //Checks if user wants a lifeline
	{
	    if (lifelineAvail == 0)
	    {
		c.setFont (ABCD);
		c.setColor (Color.black);
		c.drawString ("D", 55, 310);
		c.drawString ("B", 280, 385);
		lifelineUsed (467, 30);
		lifelineAvail++;


	    }
	    else if (lifelineAvail == 1)
	    {
		c.setFont (ABCD);
		c.setColor (Color.black);
		c.drawString ("D", 55, 310);
		c.drawString ("B", 280, 385);
		lifelineUsed (525, 30);
		lifelineAvail++;
	    }
	    else if (lifelineAvail == 2)
	    {
		c.setFont (ABCD);
		c.setColor (Color.black);
		c.drawString ("D", 55, 310);
		c.drawString ("B", 280, 385);
		lifelineUsed (580, 30);
		lifelineAvail++;
	    }
	    else if (lifelineAvail == 3)
	    {
		noLifelines ();
	    }
	    do              //error trap
	    {
		Uans1 = "";
		c.print ("Please enter the one of the possible answers:");
		Uans1 = c.readString ();
		drawMoneySection (470, 475);
	    }
	    while (!((Uans1.equals ("A")) || (Uans1.equals ("a")) || (Uans1.equals ("B")) || (Uans1.equals ("b")) || (Uans1.equals ("C")) || (Uans1.equals ("c")) || (Uans1.equals ("D")) || (Uans1.equals ("d"))));

	}

	Font rightorwrong = new Font ("Arial", Font.BOLD, 14);

	if ((Uans1.equals ("B") || (Uans1.equals ("b"))))                   //Determining whether or not the user has selected the right or wrong answer
	{
	    right ('B', 0, 470, 475);


	}
	else
	{
	    wrong ('B', 0);
	    Gameover++;
	}


	//=============================================================Questions #2====================================================================
	if (Gameover != 1)

	    {
		delay (1000);
		flashNumber (470, 450);                                             //Flashes to indicate that the user is on the second question
		delay (1500);


		c.setFont (questionFont);
		c.setColor (Color.white);


		c.drawString ("In the 'Road Runner and Coyote' ", 45, 55);         //Second question
		c.drawString ("cartoons, what famous sound ", 55, 80);
		c.drawString ("does the Road Runner make?", 55, 105);

		listAnswersSmall ("Ping! Ping!", "Vroom! Vroom!", "Aooga! Aooga!", "Beep! Beep!");

		c.setCursor (22, 2);
		do                  //error trap
		{
		    int z = 1;
		    c.print ("Please enter A,B,C,D, or Lifeline:");
		    Uans2 = c.readString ();
		    drawMoneySection (470, 450);
		    c.setCursor (22 + z, 2);
		    z++;

		}
		while (!((Uans2.equals ("A")) || (Uans2.equals ("a")) || (Uans2.equals ("B")) || (Uans2.equals ("b")) || (Uans2.equals ("C")) || (Uans2.equals ("c")) || (Uans2.equals ("D")) || (Uans2.equals ("d") || (Uans2.equals ("Lifeline") || (Uans2.equals ("lifeline"))))));

		if ((Uans2.equals ("Lifeline") || (Uans2.equals ("lifeline"))))                //Checks if user wants a lifeline
		{
		    if (lifelineAvail == 0)
		    {
			c.setFont (ABCDsmall);
			c.setColor (Color.black);
			c.drawString ("Ping! Ping!", 55, 310);
			c.drawString ("Vroom! Vroom!", 280, 310);
			lifelineUsed (467, 30);
			lifelineAvail++;


		    }
		    else if (lifelineAvail == 1)
		    {
			c.setFont (ABCDsmall);
			c.setColor (Color.black);
			c.drawString ("Ping! Ping!", 55, 310);
			c.drawString ("Vroom! Vroom!", 280, 310);
			lifelineUsed (525, 30);
			lifelineAvail++;
		    }
		    else if (lifelineAvail == 2)
		    {
			c.setFont (ABCDsmall);
			c.setColor (Color.black);
			c.drawString ("Ping! Ping!", 55, 310);
			c.drawString ("Vroom! Vroom!", 280, 310);
			lifelineUsed (580, 30);
			lifelineAvail++;
		    }
		    else if (lifelineAvail == 3)
		    {
			noLifelines ();
		    }
		    do              //error trap
		    {
			Uans2 = "";
			c.print ("Please enter the one of the possible answers:");
			Uans2 = c.readString ();
			drawMoneySection (470, 450);
		    }
		    while (!((Uans2.equals ("A")) || (Uans2.equals ("a")) || (Uans2.equals ("B")) || (Uans2.equals ("b")) || (Uans2.equals ("C")) || (Uans2.equals ("c")) || (Uans2.equals ("D")) || (Uans2.equals ("d"))));
		}

		if ((Uans2.equals ("D") || (Uans2.equals ("d"))))                   //Determining whether or not the user has selected the right or wrong answer
		{
		    right ('D', 1, 470, 450);


		}
		else
		{
		    wrong ('D', 1);
		    Gameover++;

		}
	    }
	else
	{
	}




	//=============================================================Questions #3====================================================================
	if (Gameover != 1)

	    {
		delay (1000);
		flashNumber (470, 425);                                             //Flashes to indicate that the user is on the third question
		delay (1500);


		c.setFont (questionFont);
		c.setColor (Color.white);


		c.drawString ("How many provinces are found in", 30, 55);         //third question
		c.drawString ("Canada? ", 175, 80);

		listAnswers ("10", "13", "9", "11");

		c.setCursor (22, 2);
		do                  //error trap
		{
		    int z = 1;
		    c.print ("Please enter A,B,C,D, or Lifeline:");
		    Uans3 = c.readString ();
		    drawMoneySection (470, 425);
		    c.setCursor (22 + z, 2);
		    z++;

		}
		while (!((Uans3.equals ("A")) || (Uans3.equals ("a")) || (Uans3.equals ("B")) || (Uans3.equals ("b")) || (Uans3.equals ("C")) || (Uans3.equals ("c")) || (Uans3.equals ("D")) || (Uans3.equals ("d") || (Uans3.equals ("Lifeline") || (Uans3.equals ("lifeline"))))));


		if ((Uans3.equals ("Lifeline") || (Uans3.equals ("lifeline"))))                //Checks if user wants a lifeline
		{
		    if (lifelineAvail == 0)
		    {
			c.setFont (ABCD);
			c.setColor (Color.black);
			c.drawString ("9", 55, 385);
			c.drawString ("11", 280, 385);
			lifelineUsed (467, 30);
			lifelineAvail++;


		    }
		    else if (lifelineAvail == 1)
		    {
			c.setFont (ABCD);
			c.setColor (Color.black);
			c.drawString ("9", 55, 385);
			c.drawString ("11", 280, 385);
			lifelineUsed (525, 30);
			lifelineAvail++;
		    }
		    else if (lifelineAvail == 2)
		    {
			c.setFont (ABCD);
			c.setColor (Color.black);
			c.drawString ("9", 55, 385);
			c.drawString ("11", 280, 385);
			lifelineUsed (580, 30);
			lifelineAvail++;
		    }
		    else if (lifelineAvail == 3)
		    {
			noLifelines ();
		    }
		    do              //error trap
		    {
			{
			    Uans3 = "";
			    c.print ("Please enter the one of the possible answers:");
			    Uans3 = c.readString ();
			    drawMoneySection (470, 425);
			}
		    }
		    while (!((Uans3.equals ("A")) || (Uans3.equals ("a")) || (Uans3.equals ("B")) || (Uans3.equals ("b")) || (Uans3.equals ("C")) || (Uans3.equals ("c")) || (Uans3.equals ("D")) || (Uans3.equals ("d"))));
		}

		if ((Uans3.equals ("A") || (Uans3.equals ("a"))))                   //Determining whether or not the user has selected the right or wrong answer
		{
		    right ('A', 2, 470, 425);


		}
		else
		{
		    wrong ('A', 2);
		    Gameover++;
		}
	    }
	else
	{
	}



	//=============================================================Questions #4====================================================================

	if (Gameover != 1)

	    {
		delay (1000);
		flashNumber (470, 400);                                             //Flashes to indicate that the user is on the fourth question
		delay (1500);


		c.setFont (questionFont);
		c.setColor (Color.white);


		c.drawString ("Which color is associated with", 50, 55);          //fourth question
		c.drawString ("an illegal market?", 127, 80);


		listAnswers ("Blue", "Red", "Black", "White");

		c.setCursor (22, 2);

		do                  //error trap
		{
		    int z = 1;
		    c.print ("Please enter A,B,C,D, or Lifeline:");
		    Uans4 = c.readString ();
		    drawMoneySection (470, 400);
		    c.setCursor (22 + z, 2);
		    z++;

		}


		while (!((Uans4.equals ("A")) || (Uans4.equals ("a")) || (Uans4.equals ("B")) || (Uans4.equals ("b")) || (Uans4.equals ("C")) || (Uans4.equals ("c")) || (Uans4.equals ("D")) || (Uans4.equals ("d") || (Uans4.equals ("Lifeline") || (Uans4.equals ("lifeline"))))));



		if ((Uans4.equals ("Lifeline") || (Uans4.equals ("lifeline"))))                //Checks if user wants a lifeline
		{
		    if (lifelineAvail == 0)
		    {
			c.setFont (ABCD);
			c.setColor (Color.black);
			c.drawString ("Red", 280, 310);
			c.drawString ("White", 280, 385);
			lifelineUsed (467, 30);
			lifelineAvail++;


		    }
		    else if (lifelineAvail == 1)
		    {
			c.setFont (ABCD);
			c.setColor (Color.black);
			c.drawString ("Red", 280, 310);
			c.drawString ("White", 280, 385);
			lifelineUsed (525, 30);
			lifelineAvail++;
		    }
		    else if (lifelineAvail == 2)
		    {
			c.setFont (ABCD);
			c.setColor (Color.black);
			c.drawString ("Red", 280, 310);
			c.drawString ("White", 280, 385);
			lifelineUsed (580, 30);
			lifelineAvail++;
		    }
		    else if (lifelineAvail == 3)
		    {
			noLifelines ();
		    }
		    do              //error trap
		    {
			Uans4 = "";
			c.print ("Please enter the one of the possible answers:");
			Uans4 = c.readString ();
			drawMoneySection (470, 400);
		    }
		    while (!((Uans4.equals ("A")) || (Uans4.equals ("a")) || (Uans4.equals ("B")) || (Uans4.equals ("b")) || (Uans4.equals ("C")) || (Uans4.equals ("c")) || (Uans4.equals ("D")) || (Uans4.equals ("d"))));
		}


		if ((Uans4.equals ("C") || (Uans4.equals ("c"))))                   //Determining whether or not the user has selected the right or wrong answer
		{
		    right ('C', 3, 470, 400);


		}


		else
		{
		    wrong ('C', 3);
		    Gameover++;
		}
	    }
	else
	{
	}




	//=============================================================Questions #5====================================================================

	if (Gameover != 1)
	{
	    delay (1000);
	    flashNumber (470, 375);                                             //Flashes to indicate that the user is on the fifth question
	    delay (1500);


	    c.setFont (questionFont);
	    c.setColor (Color.white);


	    c.drawString ("Which of these dance moves is", 50, 55);          //fifth question
	    c.drawString ("used to describe a fashionable", 55, 80);
	    c.drawString ("dot?", 210, 105);

	    listAnswers ("Polka", "Swing", "Lambada", "Hora");

	    c.setCursor (22, 2);


	    do                  //error trap
	    {
		int z = 1;
		c.print ("Please enter A,B,C,D, or Lifeline:");
		Uans5 = c.readString ();
		drawMoneySection (470, 375);
		c.setCursor (22 + z, 2);
		z++;

	    }


	    while (!((Uans5.equals ("A")) || (Uans5.equals ("a")) || (Uans5.equals ("B")) || (Uans5.equals ("b")) || (Uans5.equals ("C")) || (Uans5.equals ("c")) || (Uans5.equals ("D")) || (Uans5.equals ("d") || (Uans5.equals ("Lifeline") || (Uans5.equals ("lifeline"))))));


	    if ((Uans5.equals ("Lifeline") || (Uans5.equals ("lifeline"))))                //Checks if user wants a lifeline
	    {
		if (lifelineAvail == 0)
		{
		    c.setFont (ABCD);
		    c.setColor (Color.black);
		    c.drawString ("Swing", 280, 310);
		    c.drawString ("Hora", 280, 385);
		    lifelineUsed (467, 30);
		    lifelineAvail++;


		}
		else if (lifelineAvail == 1)
		{
		    c.setFont (ABCD);
		    c.setColor (Color.black);
		    c.drawString ("Swing", 280, 310);
		    c.drawString ("Hora", 280, 385);
		    lifelineUsed (525, 30);
		    lifelineAvail++;
		}
		else if (lifelineAvail == 2)
		{
		    c.setFont (ABCD);
		    c.setColor (Color.black);
		    c.drawString ("Swing", 280, 310);
		    c.drawString ("Hora", 280, 385);

		    lifelineUsed (580, 30);
		    lifelineAvail++;
		}
		else if (lifelineAvail == 3)
		{
		    noLifelines ();
		}
		do              //error trap
		{
		    Uans5 = "";
		    c.print ("Please enter the one of the possible answers:");
		    Uans5 = c.readString ();
		    drawMoneySection (470, 375);
		}
		while (!((Uans5.equals ("A")) || (Uans5.equals ("a")) || (Uans5.equals ("B")) || (Uans5.equals ("b")) || (Uans5.equals ("C")) || (Uans5.equals ("c")) || (Uans5.equals ("D")) || (Uans5.equals ("d"))));
	    }


	    if ((Uans5.equals ("A") || (Uans5.equals ("a"))))                   //Determining whether or not the user has selected the right or wrong answer
	    {
		right ('A', 4, 470, 375);


	    }


	    else
	    {
		wrong ('A', 4);
		Gameover++;                 //To ensure that the program does not move on
	    }
	}
	else
	{
	}



	//=============================================================Questions #6====================================================================

	if (Gameover != 1)
	{
	    delay (1000);
	    flashNumber (470, 350);                                             //Flashes to indicate that the user is on the sixth question
	    delay (1500);


	    c.setFont (questionFont);
	    c.setColor (Color.white);


	    c.drawString ("In the 1992 movie 'The Bodyguard'", 28, 55);          //sixth question
	    c.drawString (",who does the bodyguard protect?", 30, 80);



	    listAnswersSmall ("First Lady", "Witness", "Pop Singer", "Actress");

	    c.setCursor (22, 2);


	    do                  //error trap
	    {
		int z = 1;
		c.print ("Please enter A,B,C,D, or Lifeline:");
		Uans6 = c.readString ();
		drawMoneySection (470, 350);
		c.setCursor (22 + z, 2);
		z++;

	    }


	    while (!((Uans6.equals ("A")) || (Uans6.equals ("a")) || (Uans6.equals ("B")) || (Uans6.equals ("b")) || (Uans6.equals ("C")) || (Uans6.equals ("c")) || (Uans6.equals ("D")) || (Uans6.equals ("d") || (Uans6.equals ("Lifeline") || (Uans6.equals ("lifeline"))))));


	    if ((Uans6.equals ("Lifeline") || (Uans6.equals ("lifeline"))))                //Checks if user wants a lifeline
	    {
		if (lifelineAvail == 0)
		{
		    c.setFont (ABCDsmall);
		    c.setColor (Color.black);
		    c.drawString ("First Lady", 55, 310);
		    c.drawString ("Witness", 280, 310);
		    lifelineUsed (467, 30);
		    lifelineAvail++;


		}
		else if (lifelineAvail == 1)
		{
		    c.setFont (ABCDsmall);
		    c.setColor (Color.black);
		    c.drawString ("First Lady", 55, 310);
		    c.drawString ("Witness", 280, 310);
		    lifelineUsed (525, 30);
		    lifelineAvail++;
		}
		else if (lifelineAvail == 2)
		{
		    c.setFont (ABCDsmall);
		    c.setColor (Color.black);
		    c.drawString ("First Lady", 55, 310);
		    c.drawString ("Witness", 280, 310);
		    lifelineUsed (580, 30);
		    lifelineAvail++;
		}
		else if (lifelineAvail == 3)
		{
		    noLifelines ();
		}
		do              //error trap
		{
		    Uans6 = "";
		    c.print ("Please enter the one of the possible answers:");
		    Uans6 = c.readString ();
		    drawMoneySection (470, 350);
		}
		while (!((Uans6.equals ("A")) || (Uans6.equals ("a")) || (Uans6.equals ("B")) || (Uans6.equals ("b")) || (Uans6.equals ("C")) || (Uans6.equals ("c")) || (Uans6.equals ("D")) || (Uans6.equals ("d"))));
	    }


	    if ((Uans6.equals ("C") || (Uans6.equals ("c"))))                   //Determining whether or not the user has selected the right or wrong answer
	    {
		right ('C', 5, 470, 350);


	    }


	    else
	    {
		wrong ('C', 5);
		Gameover++;          //To ensure that the program does not move on

	    }
	}
	else
	{
	}


	//=============================================================Questions #7====================================================================

	if (Gameover != 1)
	{
	    delay (1000);
	    flashNumber (470, 325);                                             //Flashes to indicate that the user is on the seventh question
	    delay (1500);


	    c.setFont (questionFont);
	    c.setColor (Color.white);


	    c.drawString ("The TV quizshow 'Who Wants to ", 40, 55);          //seventh question
	    c.drawString ("be a Millionaire?' was first ", 80, 80);
	    c.drawString ("broadcast in which year?", 85, 105);

	    listAnswers ("1996", "1997", "1998", "1999");

	    c.setCursor (22, 2);



	    do                  //error trap
	    {
		int z = 1;
		c.print ("Please enter A,B,C,D, or Lifeline:");
		Uans7 = c.readString ();
		drawMoneySection (470, 325);
		c.setCursor (22 + z, 2);
		z++;

	    }


	    while (!((Uans7.equals ("A")) || (Uans7.equals ("a")) || (Uans7.equals ("B")) || (Uans7.equals ("b")) || (Uans7.equals ("C")) || (Uans7.equals ("c")) || (Uans7.equals ("D")) || (Uans7.equals ("d") || (Uans7.equals ("Lifeline") || (Uans7.equals ("lifeline"))))));



	    if ((Uans7.equals ("Lifeline") || (Uans7.equals ("lifeline"))))                //Checks if user wants a lifeline
	    {
		if (lifelineAvail == 0)
		{
		    c.setFont (ABCD);
		    c.setColor (Color.black);
		    c.drawString ("1996", 55, 310);
		    c.drawString ("1999", 280, 385);
		    lifelineUsed (467, 30);
		    lifelineAvail++;


		}
		else if (lifelineAvail == 1)
		{
		    c.setFont (ABCD);
		    c.setColor (Color.black);
		    c.drawString ("1996", 55, 310);
		    c.drawString ("1999", 280, 385);
		    lifelineUsed (525, 30);
		    lifelineAvail++;
		}
		else if (lifelineAvail == 2)
		{
		    c.setFont (ABCD);
		    c.setColor (Color.black);
		    c.drawString ("1996", 55, 310);
		    c.drawString ("1999", 280, 385);
		    lifelineUsed (580, 30);
		    lifelineAvail++;
		}
		else if (lifelineAvail == 3)
		{
		    noLifelines ();
		}
		do              //error trap
		{
		    Uans7 = "";
		    c.print ("Please enter the one of the possible answers:");
		    Uans7 = c.readString ();
		    drawMoneySection (470, 325);
		}
		while (!((Uans7.equals ("A")) || (Uans7.equals ("a")) || (Uans7.equals ("B")) || (Uans7.equals ("b")) || (Uans7.equals ("C")) || (Uans7.equals ("c")) || (Uans7.equals ("D")) || (Uans7.equals ("d"))));
	    }


	    if ((Uans7.equals ("C") || (Uans7.equals ("c"))))                   //Determining whether or not the user has selected the right or wrong answer
	    {
		right ('C', 6, 470, 325);


	    }


	    else
	    {
		wrong ('C', 6);
		Gameover++;                 //To ensure that the program does not move on
	    }
	}
	else
	{
	}


	//=============================================================Questions #8====================================================================

	if (Gameover != 1)
	{
	    delay (1000);
	    flashNumber (470, 300);                                             //Flashes to indicate that the user is on the eighth question
	    delay (1500);

	    c.setFont (questionFont);
	    c.setColor (Color.white);


	    c.drawString ("How many Oscars did the movie", 40, 55);          //eighth question
	    c.drawString ("'Titanic' get? ", 160, 80);


	    listAnswers ("7", "11", "10", "13");

	    c.setCursor (22, 2);



	    do                  //error trap
	    {
		int z = 1;
		c.print ("Please enter A,B,C,D, or Lifeline:");
		Uans8 = c.readString ();
		drawMoneySection (470, 300);
		c.setCursor (22 + z, 2);
		z++;

	    }


	    while (!((Uans8.equals ("A")) || (Uans8.equals ("a")) || (Uans8.equals ("B")) || (Uans8.equals ("b")) || (Uans8.equals ("C")) || (Uans8.equals ("c")) || (Uans8.equals ("D")) || (Uans8.equals ("d") || (Uans8.equals ("Lifeline") || (Uans8.equals ("lifeline"))))));


	    if ((Uans8.equals ("Lifeline") || (Uans8.equals ("lifeline"))))                //Checks if user wants a lifeline
	    {
		if (lifelineAvail == 0)
		{
		    c.setFont (ABCD);
		    c.setColor (Color.black);
		    c.drawString ("7", 55, 310);
		    c.drawString ("13", 280, 385);
		    lifelineUsed (467, 30);
		    lifelineAvail++;


		}
		else if (lifelineAvail == 1)
		{
		    c.setFont (ABCD);
		    c.setColor (Color.black);
		    c.drawString ("7", 55, 310);
		    c.drawString ("13", 280, 385);
		    lifelineUsed (525, 30);
		    lifelineAvail++;
		}
		else if (lifelineAvail == 2)
		{
		    c.setFont (ABCD);
		    c.setColor (Color.black);
		    c.drawString ("7", 55, 310);
		    c.drawString ("13", 280, 385);
		    lifelineUsed (580, 30);
		    lifelineAvail++;
		}
		else if (lifelineAvail == 3)
		{
		    noLifelines ();
		}
		do              //error trap
		{
		    Uans8 = "";
		    c.print ("Please enter the one of the possible answers:");
		    Uans8 = c.readString ();
		    drawMoneySection (470, 300);
		}
		while (!((Uans8.equals ("A")) || (Uans8.equals ("a")) || (Uans8.equals ("B")) || (Uans8.equals ("b")) || (Uans8.equals ("C")) || (Uans8.equals ("c")) || (Uans8.equals ("D")) || (Uans8.equals ("d"))));
	    }


	    if ((Uans8.equals ("B") || (Uans8.equals ("b"))))                   //Determining whether or not the user has selected the right or wrong answer
	    {
		right ('B', 7, 470, 300);


	    }


	    else
	    {
		wrong ('B', 7);
		Gameover++;                   //To ensure that the program does not move on
	    }
	}
	else
	{
	}


	//=============================================================Questions #9====================================================================

	if (Gameover != 1)
	{
	    delay (1000);
	    flashNumber (470, 275);                                             //Flashes to indicate that the user is on the ninth question
	    delay (1500);

	    c.setFont (questionFont);
	    c.setColor (Color.white);

	    c.drawString ("How many countries border the", 45, 55);          //ninth question
	    c.drawString ("Caspian Sea? ", 150, 80);

	    listAnswers ("3", "2", "6", "5");

	    c.setCursor (22, 2);


	    do                  //error trap
	    {
		int z = 1;
		c.print ("Please enter A,B,C,D, or Lifeline:");
		Uans9 = c.readString ();
		drawMoneySection (470, 275);
		c.setCursor (22 + z, 2);
		z++;

	    }


	    while (!((Uans9.equals ("A")) || (Uans9.equals ("a")) || (Uans9.equals ("B")) || (Uans9.equals ("b")) || (Uans9.equals ("C")) || (Uans9.equals ("c")) || (Uans9.equals ("D")) || (Uans9.equals ("d") || (Uans9.equals ("Lifeline") || (Uans9.equals ("lifeline"))))));



	    if ((Uans9.equals ("Lifeline") || (Uans9.equals ("lifeline"))))                //Checks if user wants a lifeline
	    {
		if (lifelineAvail == 0)
		{
		    c.setFont (ABCD);
		    c.setColor (Color.black);
		    c.drawString ("2", 280, 310);
		    c.drawString ("6", 55, 385);
		    lifelineUsed (467, 30);
		    lifelineAvail++;


		}
		else if (lifelineAvail == 1)
		{
		    c.setFont (ABCD);
		    c.setColor (Color.black);
		    c.drawString ("2", 280, 310);
		    c.drawString ("6", 55, 385);
		    lifelineUsed (525, 30);
		    lifelineAvail++;
		}
		else if (lifelineAvail == 2)
		{
		    c.setFont (ABCD);
		    c.setColor (Color.black);
		    c.drawString ("2", 280, 310);
		    c.drawString ("6", 55, 385);
		    lifelineUsed (580, 30);
		    lifelineAvail++;
		}
		else if (lifelineAvail == 3)
		{
		    noLifelines ();
		}
		do              //error trap
		{
		    Uans9 = "";
		    c.print ("Please enter the one of the possible answers:");
		    Uans9 = c.readString ();
		    drawMoneySection (470, 275);
		}
		while (!((Uans9.equals ("A")) || (Uans9.equals ("a")) || (Uans9.equals ("B")) || (Uans9.equals ("b")) || (Uans9.equals ("C")) || (Uans9.equals ("c")) || (Uans9.equals ("D")) || (Uans9.equals ("d"))));
	    }



	    if ((Uans9.equals ("D") || (Uans9.equals ("d"))))                   //Determining whether or not the user has selected the right or wrong answer
	    {
		right ('D', 8, 470, 275);


	    }


	    else
	    {
		wrong ('D', 8);
		Gameover++;                   //To ensure that the program does not move on
	    }
	}
	else
	{
	}


	//=============================================================Questions #10====================================================================
	if (Gameover != 1)
	{
	    delay (1000);
	    flashNumber (470, 250);                                             //Flashes to indicate that the user is on the 10th question
	    delay (1500);

	    c.setFont (questionFont);
	    c.setColor (Color.white);

	    c.drawString ("Who was one of the co-founders", 40, 55);          //10th question
	    c.drawString ("of Insulin?", 175, 80);

	    listAnswersSmall ("Albert Sabin", "Charles Best", "Niels Bohr", "Jonas Salk");


	    c.setCursor (22, 2);


	    do                  //error trap
	    {
		int z = 1;
		c.print ("Please enter A,B,C,D, or Lifeline:");
		Uans10 = c.readString ();
		drawMoneySection (470, 250);
		c.setCursor (22 + z, 2);
		z++;

	    }


	    while (!((Uans10.equals ("A")) || (Uans10.equals ("a")) || (Uans10.equals ("B")) || (Uans10.equals ("b")) || (Uans10.equals ("C")) || (Uans10.equals ("c")) || (Uans10.equals ("D")) || (Uans10.equals ("d") || (Uans10.equals ("Lifeline") || (Uans10.equals ("lifeline"))))));


	    if ((Uans10.equals ("Lifeline") || (Uans10.equals ("lifeline"))))                //Checks if user wants a lifeline
	    {
		if (lifelineAvail == 0)
		{
		    c.setFont (ABCDsmall);
		    c.setColor (Color.black);
		    c.drawString ("Niels Bohr", 55, 385);
		    c.drawString ("Jonas Salk", 280, 385);
		    lifelineUsed (467, 30);
		    lifelineAvail++;


		}
		else if (lifelineAvail == 1)
		{
		    c.setFont (ABCDsmall);
		    c.setColor (Color.black);
		    c.drawString ("Niels Bohr", 55, 385);
		    c.drawString ("Jonas Salk", 280, 385);
		    lifelineUsed (525, 30);
		    lifelineAvail++;
		}
		else if (lifelineAvail == 2)
		{
		    c.setFont (ABCDsmall);
		    c.setColor (Color.black);
		    c.drawString ("Niels Bohr", 55, 385);
		    c.drawString ("Jonas Salk", 280, 385);
		    lifelineUsed (580, 30);
		    lifelineAvail++;
		}
		else if (lifelineAvail == 3)
		{
		    noLifelines ();
		}
		do              //error trap
		{
		    Uans10 = "";
		    c.print ("Please enter the one of the possible answers:");
		    Uans10 = c.readString ();
		    drawMoneySection (470, 250);
		}
		while (!((Uans10.equals ("A")) || (Uans10.equals ("a")) || (Uans10.equals ("B")) || (Uans10.equals ("b")) || (Uans10.equals ("C")) || (Uans10.equals ("c")) || (Uans10.equals ("D")) || (Uans10.equals ("d"))));
	    }


	    if ((Uans10.equals ("B") || (Uans10.equals ("b"))))                   //Determining whether or not the user has selected the right or wrong answer
	    {
		right ('B', 9, 470, 250);


	    }


	    else
	    {
		wrong ('B', 9);
		Gameover++; //To ensure that the program does not move on
	    }
	}
	else
	{
	}

	//=============================================================Questions #11====================================================================
	if (Gameover != 1)
	{
	    delay (1000);
	    flashNumber (470, 225);                                             //Flashes to indicate that the user is on the 11th question
	    delay (1500);

	    c.setFont (questionFont);
	    c.setColor (Color.white);

	    c.drawString ("Which of the following is NOT a", 45, 55);          //11th question
	    c.drawString ("possible colour of a Giraffes'", 65, 80);
	    c.drawString ("tongue", 195, 105);

	    listAnswers ("Black", "Purple", "Blue", "Green");


	    c.setCursor (22, 2);


	    do                  //error trap
	    {
		int z = 1;
		c.print ("Please enter A,B,C,D, or Lifeline:");
		Uans11 = c.readString ();
		drawMoneySection (470, 225);
		c.setCursor (22 + z, 2);
		z++;

	    }


	    while (!((Uans11.equals ("A")) || (Uans11.equals ("a")) || (Uans11.equals ("B")) || (Uans11.equals ("b")) || (Uans11.equals ("C")) || (Uans11.equals ("c")) || (Uans11.equals ("D")) || (Uans11.equals ("d") || (Uans11.equals ("Lifeline") || (Uans11.equals ("lifeline"))))));



	    if ((Uans11.equals ("Lifeline") || (Uans11.equals ("lifeline"))))                //Checks if user wants a lifeline
	    {
		if (lifelineAvail == 0)
		{
		    c.setFont (ABCD);
		    c.setColor (Color.black);
		    c.drawString ("Black", 55, 310);
		    c.drawString ("Blue", 55, 385);
		    lifelineUsed (467, 30);
		    lifelineAvail++;


		}
		else if (lifelineAvail == 1)
		{
		    c.setFont (ABCD);
		    c.setColor (Color.black);
		    c.drawString ("Black", 55, 310);
		    c.drawString ("Blue", 55, 385);
		    lifelineUsed (525, 30);
		    lifelineAvail++;
		}
		else if (lifelineAvail == 2)
		{
		    c.setFont (ABCD);
		    c.setColor (Color.black);
		    c.drawString ("Black", 55, 310);
		    c.drawString ("Blue", 55, 385);
		    lifelineUsed (580, 30);
		    lifelineAvail++;
		}
		else if (lifelineAvail == 3)
		{
		    noLifelines ();
		}
		do              //error trap
		{
		    Uans11 = "";
		    c.print ("Please enter the one of the possible answers:");
		    Uans11 = c.readString ();
		    drawMoneySection (470, 225);
		}
		while (!((Uans11.equals ("A")) || (Uans11.equals ("a")) || (Uans11.equals ("B")) || (Uans11.equals ("b")) || (Uans11.equals ("C")) || (Uans11.equals ("c")) || (Uans11.equals ("D")) || (Uans11.equals ("d"))));
	    }


	    if ((Uans11.equals ("D") || (Uans11.equals ("d"))))          //Determining whether or not the user has selected the right or wrong answer
	    {
		right ('D', 10, 470, 225);


	    }


	    else
	    {
		wrong ('D', 10);
		Gameover++;               //To ensure that the program does not move on
	    }
	}
	else
	{
	}


	//=============================================================Questions #12====================================================================

	if (Gameover != 1)
	{
	    delay (1000);
	    flashNumber (470, 200);                                             //Flashes to indicate that the user is on the 12th question
	    delay (1500);

	    c.setFont (questionFont);
	    c.setColor (Color.white);

	    c.drawString ("The young of which creature is", 45, 55);          //12th question
	    c.drawString ("known as a 'Kit'?", 130, 80);


	    listAnswers ("Lion", "Tiger", "Koala", "Rabbit");


	    c.setCursor (22, 2);


	    do                  //error trap
	    {
		int z = 1;
		c.print ("Please enter A,B,C,D, or Lifeline:");
		Uans12 = c.readString ();
		drawMoneySection (470, 200);
		c.setCursor (22 + z, 2);
		z++;

	    }
	    while (!((Uans12.equals ("A")) || (Uans12.equals ("a")) || (Uans12.equals ("B")) || (Uans12.equals ("b")) || (Uans12.equals ("C")) || (Uans12.equals ("c")) || (Uans12.equals ("D")) || (Uans12.equals ("d") || (Uans12.equals ("Lifeline") || (Uans12.equals ("lifeline"))))));




	    if ((Uans12.equals ("Lifeline") || (Uans12.equals ("lifeline"))))                //Checks if user wants a lifeline
	    {
		if (lifelineAvail == 0)
		{
		    c.setFont (ABCD);
		    c.setColor (Color.black);
		    c.drawString ("Lion", 55, 310);
		    c.drawString ("Tiger", 280, 310);
		    lifelineUsed (467, 30);
		    lifelineAvail++;


		}
		else if (lifelineAvail == 1)
		{
		    c.setFont (ABCD);
		    c.setColor (Color.black);
		    c.drawString ("Lion", 55, 310);
		    c.drawString ("Tiger", 280, 310);
		    lifelineUsed (525, 30);
		    lifelineAvail++;
		}
		else if (lifelineAvail == 2)
		{
		    c.setFont (ABCD);
		    c.setColor (Color.black);
		    c.drawString ("Lion", 55, 310);
		    c.drawString ("Tiger", 280, 310);
		    lifelineUsed (580, 30);
		    lifelineAvail++;
		}
		else if (lifelineAvail == 3)
		{
		    noLifelines ();
		}
		do              //error trap
		{
		    Uans12 = "";
		    c.print ("Please enter the one of the possible answers:");
		    Uans12 = c.readString ();
		    drawMoneySection (470, 200);
		}
		while (!((Uans12.equals ("A")) || (Uans12.equals ("a")) || (Uans12.equals ("B")) || (Uans12.equals ("b")) || (Uans12.equals ("C")) || (Uans12.equals ("c")) || (Uans12.equals ("D")) || (Uans12.equals ("d"))));
	    }


	    if ((Uans12.equals ("D") || (Uans12.equals ("d"))))          //Determining whether or not the user has selected the right or wrong answer
	    {
		right ('D', 11, 470, 200);


	    }


	    else
	    {
		wrong ('D', 11);
		Gameover++;               //To ensure that the program does not move on
	    }
	}
	else
	{
	}






	// Place your program here.  'c' is the output console
    } // main method


    public static void rightAnswer (char A)                             //method that highlights right answer box
    {
	c.setColor (Color.yellow);
	if (A == 'A')
	{
	    int[] a = {30, 205, 225, 205, 30, 10, 30};
	    int[] a1 = {270, 270, 300, 330, 330, 300, 270};      //A Box
	    c.drawPolygon (a, a1, 7);

	    int[] a2 = {31, 206, 226, 205, 31, 11, 30};
	    int[] a3 = {271, 271, 300, 331, 331, 300, 271};
	    c.drawPolygon (a2, a3, 7);

	    int[] a4 = {32, 207, 227, 205, 32, 12, 30};
	    int[] a5 = {272, 272, 300, 332, 332, 300, 272};
	    c.drawPolygon (a4, a5, 7);

	}


	else if (A == 'B')
	{
	    int[] b = {255, 430, 450, 430, 255, 235, 255};
	    int[] b1 = {270, 270, 300, 330, 330, 300, 270};      //B Box
	    c.drawPolygon (b, b1, 7);

	    int[] b2 = {256, 431, 451, 430, 256, 236, 255};
	    int[] b3 = {271, 271, 300, 331, 331, 300, 271};
	    c.drawPolygon (b2, b3, 7);

	    int[] b4 = {257, 432, 452, 430, 257, 237, 255};
	    int[] b5 = {272, 272, 300, 332, 332, 300, 272};
	    c.drawPolygon (b4, b5, 7);
	}


	else if (A == 'C')
	{
	    int[] c2 = {30, 205, 225, 205, 30, 10, 30};          //C Box
	    int[] c3 = {345, 345, 375, 405, 405, 375, 345};
	    c.drawPolygon (c2, c3, 7);

	    int[] c4 = {31, 206, 226, 205, 31, 11, 30};
	    int[] c5 = {346, 346, 375, 406, 406, 375, 346};
	    c.drawPolygon (c4, c5, 7);

	    int[] c6 = {32, 207, 227, 205, 32, 12, 30};
	    int[] c7 = {347, 347, 375, 407, 407, 375, 347};
	    c.drawPolygon (c6, c7, 7);
	}


	else
	{
	    int[] d = {255, 430, 450, 430, 255, 235, 255};      //D Box
	    int[] d1 = {345, 345, 375, 405, 405, 375, 345};
	    c.drawPolygon (d, d1, 7);

	    int[] d2 = {256, 431, 451, 430, 256, 236, 255};
	    int[] d3 = {346, 346, 375, 406, 406, 375, 346};
	    c.drawPolygon (d2, d3, 7);

	    int[] d4 = {257, 432, 452, 430, 257, 237, 255};
	    int[] d5 = {347, 347, 375, 407, 407, 375, 347};
	    c.drawPolygon (d4, d5, 7);

	}



    }


    public static void drawMoneySection (int x, int y)                      //redraws money section, x y is the question that the user is on
    {
	Color gameBoardBlue = new Color (71, 165, 220);

	c.setColor (Color.black);
	c.fillRect (458, 85, 225, 410);
	c.setColor (gameBoardBlue);

	c.drawRect (460, 5, 175, 490);
	c.drawRect (461, 6, 175, 490);      //Money + lifeline section
	c.drawRect (462, 7, 175, 490);
	Font moneySection = new Font ("Arial", Font.BOLD, 20);          //Money graphics
	c.setFont (moneySection);
	c.setColor (Color.white);
	c.drawString ("1.         $100", 470, 475);
	c.drawString ("2.         $200", 470, 450);
	c.drawString ("3.         $300", 470, 425);
	c.drawString ("4.         $500", 470, 400);
	c.drawString ("5.        $1000", 470, 375);
	c.drawString ("6.        $2000", 470, 350);
	c.drawString ("7.        $4000", 470, 325);
	c.drawString ("8.        $8000", 470, 300);
	c.drawString ("9.      $16 000", 470, 275);
	c.drawString ("10.    $32 000", 470, 250);
	c.drawString ("11.    $64 000", 470, 225);
	c.drawString ("12.    $125 000", 470, 200);
	c.drawString ("13.    $250 000", 470, 175);
	c.drawString ("14.    $500 000", 470, 150);
	c.drawString ("15.  $1 000 000", 470, 125);

	c.setColor (gameBoardBlue);
	c.drawRect (3, 420, 452, 75);
	c.drawRect (4, 421, 452, 75);       //User interaction
	c.drawRect (5, 422, 452, 75);



	c.setColor (Color.yellow);
	highlight (x, y);



    }


    public static void highlight (int x, int y)                 //Command that highlights which question the player is in
    {
	c.setColor (Color.yellow);
	c.drawRect (x - 5, y - 20, 165, 25);
    }


    public static void clearHighlight (int x, int y)           //Command that removes highlight
    {
	c.setColor (Color.black);
	c.drawRect (x - 5, y - 20, 165, 25);


    }


    public static void lifelineUsed (int x, int y)            //Method that gets rid of a lifeline after it is used
    {
	c.setColor (Color.red);
	Font lifelineSection = new Font ("Arial", Font.BOLD, 16);
	c.setFont (lifelineSection);

	c.fillOval (x - 2, y - 2, 57, 57);


    }


    public static void clear ()                       //Method that clears the question and answers
    {
	c.setColor (Color.black);
	c.fillRect (29, 29, 406, 220);      //clears question box

	c.fillRect (50, 275, 150, 53);       //clears A box
	c.fillRect (50, 285, 160, 33);

	c.fillRect (277, 275, 150, 53);       //clears B box
	c.fillRect (277, 285, 160, 33);

	c.fillRect (51, 350, 150, 53);       //clears C box
	c.fillRect (51, 360, 160, 33);

	c.fillRect (277, 350, 150, 53);       //clears D box
	c.fillRect (277, 360, 160, 33);

	c.setColor (Color.black);
	c.fillRect (0, 424, 440, 80);         //clears User interaction


	c.setColor (Color.white);
	c.fillRect (6, 423, 448, 72);         //clears User interaction

	Color gameBoardBlue = new Color (71, 165, 220);
	c.setColor (gameBoardBlue);

	int[] a = {30, 205, 225, 205, 30, 10, 30};
	int[] a1 = {270, 270, 300, 330, 330, 300, 270};      //A Box
	c.drawPolygon (a, a1, 7);

	int[] a2 = {31, 206, 226, 205, 31, 11, 30};
	int[] a3 = {271, 271, 300, 331, 331, 300, 271};
	c.drawPolygon (a2, a3, 7);

	int[] a4 = {32, 207, 227, 205, 32, 12, 30};
	int[] a5 = {272, 272, 300, 332, 332, 300, 272};
	c.drawPolygon (a4, a5, 7);




	int[] b = {255, 430, 450, 430, 255, 235, 255};
	int[] b1 = {270, 270, 300, 330, 330, 300, 270};      //B Box
	c.drawPolygon (b, b1, 7);

	int[] b2 = {256, 431, 451, 430, 256, 236, 255};
	int[] b3 = {271, 271, 300, 331, 331, 300, 271};
	c.drawPolygon (b2, b3, 7);

	int[] b4 = {257, 432, 452, 430, 257, 237, 255};
	int[] b5 = {272, 272, 300, 332, 332, 300, 272};
	c.drawPolygon (b4, b5, 7);




	int[] c2 = {30, 205, 225, 205, 30, 10, 30};          //C Box
	int[] c3 = {345, 345, 375, 405, 405, 375, 345};
	c.drawPolygon (c2, c3, 7);

	int[] c4 = {31, 206, 226, 205, 31, 11, 30};
	int[] c5 = {346, 346, 375, 406, 406, 375, 346};
	c.drawPolygon (c4, c5, 7);

	int[] c6 = {32, 207, 227, 205, 32, 12, 30};
	int[] c7 = {347, 347, 375, 407, 407, 375, 347};
	c.drawPolygon (c6, c7, 7);



	int[] d = {255, 430, 450, 430, 255, 235, 255};      //D Box
	int[] d1 = {345, 345, 375, 405, 405, 375, 345};
	c.drawPolygon (d, d1, 7);

	int[] d2 = {256, 431, 451, 430, 256, 236, 255};
	int[] d3 = {346, 346, 375, 406, 406, 375, 346};
	c.drawPolygon (d2, d3, 7);

	int[] d4 = {257, 432, 452, 430, 257, 237, 255};
	int[] d5 = {347, 347, 375, 407, 407, 375, 347};
	c.drawPolygon (d4, d5, 7);

	c.drawRect (3, 420, 452, 75);
	c.drawRect (4, 421, 452, 75);       //User interaction
	c.drawRect (5, 422, 452, 75);





    }


    public static void flashNumber (int x, int y)         //Method the flashes which question the user is on
    {

	for (int z = 0 ; z < 2 ; z++)
	{
	    highlight (x, y);
	    delay (500);
	    clearHighlight (x, y);
	    delay (500);
	    highlight (x, y);
	}
    }


    public static void noLifelines ()       //method that indicates the user that they have no more lifelines
    {
	Font rightorwrong = new Font ("Arial", Font.BOLD, 14);
	c.setColor (Color.white);
	c.setFont (rightorwrong);
	c.drawString ("You have no more lifelines available!", 105, 220);
	delay (3250);
	c.setColor (Color.black);
	c.drawString ("You have no more lifelines available!", 105, 220);

    }


    public static void wrong (char A, int Z)        //method that runs if the user selected the wrong answer
    {
	Font rightorwrong = new Font ("Arial", Font.BOLD, 14);
	String[] Cans = new String [15];  //Cans = the right answer
	//Declaring all the answers for the array
	Cans [0] = "B";
	Cans [1] = "D";
	Cans [2] = "A";
	Cans [3] = "C";
	Cans [4] = "A";
	Cans [5] = "C";
	Cans [6] = "C";
	Cans [7] = "B";
	Cans [8] = "D";
	Cans [9] = "B";
	Cans [10] = "D";
	Cans [11] = "D";

	rightAnswer (A);
	c.setFont (rightorwrong);
	c.setColor (Color.white);
	c.drawString ("Sorry, you have chosen the wrong answer! The right", 35, 220);
	c.drawString ("answer is " + Cans [Z] + ". Restart the game if you wish to play again", 35, 240);

    }


    public static void right (char A, int D, int E, int F)      //method that runs if the user selected the right answer

    {
	String[] Cans = new String [15];    //Cans = the right answer
	//Declaring all the answers for the array
	Cans [0] = "B";
	Cans [1] = "D";
	Cans [2] = "A";
	Cans [3] = "C";
	Cans [4] = "A";
	Cans [5] = "C";
	Cans [6] = "C";
	Cans [7] = "B";
	Cans [8] = "D";
	Cans [9] = "B";
	Cans [10] = "D";
	Cans [11] = "D";

	Font rightorwrong = new Font ("Arial", Font.BOLD, 14);
	rightAnswer (A);
	c.setColor (Color.white);
	c.setFont (rightorwrong);
	c.drawString ("Congratulations you chosen the right answer, which is", 35, 220);
	c.drawString (Cans [D] + "! Press any key to move on to the next question!", 35, 240);
	c.getChar ();
	clearHighlight (E, F);
	clear ();
    }


    public static void listAnswers (String A, String B, String D, String E)   //method that lists the possible answers
    {
	c.setColor (Color.white);
	Font ABCD = new Font ("Arial", Font.BOLD, 25);
	c.setFont (ABCD);
	delay (1500);
	c.drawString (A, 55, 310);                        //A box
	delay (1500);
	c.drawString (B, 280, 310);                       //B box
	delay (1500);
	c.drawString (D, 55, 385);                        //C box
	delay (1500);
	c.drawString (E, 280, 385);                       //D box

    }


    public static void listAnswersSmall (String A, String B, String D, String E)   //method that lists the possible answers (with smaller font)
    {
	c.setColor (Color.white);
	Font ABCDsmall = new Font ("Arial", Font.BOLD, 22);
	c.setFont (ABCDsmall);
	delay (1500);
	c.drawString (A, 55, 310);                        //A box
	delay (1500);
	c.drawString (B, 280, 310);                       //B box
	delay (1500);
	c.drawString (D, 55, 385);                        //C box
	delay (1500);
	c.drawString (E, 280, 385);                       //D box

    }



    public static void delay (int millisecs)                 // Delay Method
    {
	try
	{
	    Thread.currentThread ().sleep (millisecs);
	}


	catch (InterruptedException e)
	{
	}
    }
} // Culminating class


