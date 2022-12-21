# program to create a semi graphical 'id card' from basic integer and string user input
# my first perl program

use strict;
use warnings;

print("Please enter your details.\n");

print("First name: \n");
my $fName = <STDIN>;
chomp($fName);
print("Middle name: \n");
my $mName = <STDIN>;
chomp($mName);
print("Last name: \n");
my $lName = <STDIN>;
chomp($lName);
print("Date of Birth (DD/MM/YYYY): \n");
my $dob = <STDIN>;
chomp($dob);
my ($dob_day, $dob_month, $dob_year) = split /\//, $dob;
print("Country of Residence: \n");
my $residence = <STDIN>;
chomp($residence);
print("Nationality: \n");
my $nationality = <STDIN>;
chomp($nationality);

my $current_time = time();
my ($current_day, $current_month, $current_year) = (localtime($current_time))[3, 4, 5];
$current_year += 1900;
$current_month += 1;

my $age = $current_year - $dob_year;
if ($current_month < $dob_month || ($current_month == $dob_month && $current_day < $dob_day)) {
  $age -= 1;
}

print ("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n");
print ("  ID CARD                                           \n");
print ("                                                    \n");
print ("  Name:              $fName $mName $lName           \n");
print ("  Age:               $age                           \n");
print ("  DoB:               $dob                           \n");
print ("  Residence:         $residence                     \n");
print ("  Nationality:       $nationality                   \n");
print ("                                                    \n");
print ("  Created on:        $current_day, $current_month, $current_year\n");
print ("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n");