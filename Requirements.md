# Group Members
Evan Ballinger

Tian Liu

Justin Wu

# Project Description
Create an implementation class of the StrategicPlayer interface.  The class should implement a good strategy to win at the coin wheel game with a setup of four coins per wheel, and two reveals allowed per spin.  The class should competently play a game with any other starting setup.

# List of Stakeholders:
1. A game statistician who will be using the StrategicPlayer implementation to run many simulations of a the Coin Wheel Game for the purposes of statistical analysis
1. Future developers who might want to anylize and modify the strategy used in the StrategicPlayer implementation

# Requirements and Acceptance Criterea
1. Requirement: The method getSlotsToReveal must return a string of "proper length".
    - Given the user creates a new Player object and calls the beginGame method, passing int values for coinsPerWheel, revealsPerSpin, and maxNumSpins.
    - When the user calls getSlotsToReveal, 
    - Then the return value will be a charSequence with length = coinsPerWheel
