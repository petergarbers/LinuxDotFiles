#!/bin/sh
cd /home/$USER
setxkbmap en
if [[ $MACHINE_NAME == "grim" ]]
then
    xrandr --output DP-1 --primary --mode 2560x1440 --pos 2549x0 --rotate normal --output HDMI-1 --off --output DP-2 --mode 1920x1080 --pos 5109x180 --rotate normal --output DP-3 --mode 2560x1440 --pos 0x0 --rotate normal --output DP-4 --off

fi

if [[ $MACHINE_NAME == "doom" ]]
then
  xrdb ~/.Xdefaults -merge ~/.X4K
fi

exec i3
