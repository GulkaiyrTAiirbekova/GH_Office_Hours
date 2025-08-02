nano auto_git_push.sh # "nano" can be called differently

chmod +x auto_git_push.sh //manually

crontab -e

0 23 * * * /path/to/auto_git_push.sh

cd ~/Documents/MyProject

Creates a variable named DATE that stores the current date
$(...) it excecutes the command inside and stores its output
date +"%Y-%m_%d" formats the date as YYYY-MM-DD (e.g., 2025-04-08)
You could customize the format if desired(e.g., +"%d-%m-%Y" for DD-MM-YYYY)

crontab -e
Opens the crontab editor to schedule recurring tasks

-e means "edit" the current user's crontab

0 23 * * * /path/to/auto_git_push.sh

A crontab entry that specifies when to run your scripts
Format: minute to hour day_of_month month day-of-week command

0-Run at minute 0(top the hour)
23 - Run at hour 23(11:00 PM)
* - Run every day of the month
* -Run every month
* -Run every day of the week

Export EDITOR=nano
crontab -e


After running crontab -e,press "i" to enter insert mode
Type your crontab entry(e.g., 0 23 * * * /path/to/auto_git_push.sh)
When you're done, press Esc to exit insert mode

Type :wq(colon,w,q) and press Enter to save and quit
