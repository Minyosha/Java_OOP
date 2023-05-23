#!/bin/bash

read -p "Введите путь к дирректории: " DELDIR

if [ -e $DELDIR ]
        then
                echo 'Удаление файлов *.bak *.tmp *.backup из указанной директории'
                cd $DELDIR                
                rm -v *.bak *.tmp *.backup
                echo 'Файлы *.bak *.tmp *.backup успешно удалены'
        else
                echo 'Указанной дирректории не существует'
                exit 2
fi
