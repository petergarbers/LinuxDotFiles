#!/bin/sh
cd /home/$USER
setxkbmap en
xrandr --output DP-0 --primary --mode 2560x1440 --rate 144.00 --pos 0x0 --rotate normal --output DP-1 --off --output HDMI-0 --off --output DP-2 --mode 2560x1440 --rate 144.00  --pos 2560x0 --rotate normal --output DP-3 --off --output DP-4 --mode 1920x1080 --pos 5120x180 --rotate normal --output DP-5 --off --output USB-C-0 --off
exec i3
