def add
    puts "\nAddition"
    puts "\nPlease enter your first number: "
    num1 = gets.chomp.to_i
    puts "\nPlease enter your second number: \n"
    num2 = gets.chomp.to_i

    sum = num1 + num2
    puts sum
end

def subtract
    puts "\nAddition"
    puts "\nPlease enter your first number: "
    num1 = gets.chomp.to_i
    puts "\nPlease enter your second number: \n"
    num2 = gets.chomp.to_i

    sum = num1 - num2
    puts sum
end

def multiply
    puts "\nAddition"
    puts "\nPlease enter your first number: "
    num1 = gets.chomp.to_i
    puts "\nPlease enter your second number: \n"
    num2 = gets.chomp.to_i

    sum = num1 * num2
    puts sum
end

def divide
    puts "\nAddition"
    puts "\nPlease enter your first number: "
    num1 = gets.chomp.to_i
    puts "\nPlease enter your second number: \n"
    num2 = gets.chomp.to_i

    sum = num1 / num2
    puts sum
end


puts "Calculator Program"
puts "By Will Holbrook"
puts "written in Ruby\n"

puts "Choose your operand: \n"
puts "1. Add"
puts "2. Subtract"
puts "3. Multiply"
puts "4. Divide\n"

choice = gets.chomp.to_i

if choice == 1
    add
elsif choice == 2
    subtract
elsif choice == 3
    multiply
elsif choice == 4
    divide
else
    puts "Invlalid.\n"
end