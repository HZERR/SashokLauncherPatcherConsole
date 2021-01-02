# SashokLauncherPatcher
Patcher of launchers that are based on the Sashok274 launcher.


## WARNING!!! Работает только под Windows!!!

### Начало:
1. Необходимо создать пустую папку, в которой будет происходить вся "магия"
2. Скопировать в созданную папку jar-файл проекта, который необходимо пропатчить
3. Открыть в IDE класс ru.hzerr.IOHelper и поменять пути FOLDER_FULL_NAME и PROJECT_FULL_NAME, а также изменить тестовое название jar-файла (PROJECT_TEST_NAME)
4. Открыть класс ru.hzerr.Deobfuscator и изменить названия классов на те, которые соответствуют взламываемому jar-файлу

## WARNING!!! Желательно запускать у каждого класса метод main отдельно
### Патчинг
1. Запустить ru.hzerr.util.Unpack.main()
2. Запустить ru.hzerr.util.ManifestChanger.main()
3. Запустить ru.hzerr.util.Tranformator.main()
4. Запустить ru.hzerr.util.Builder.main() (см. вывод в консоль!)
5. Если какие-то папки не были добавлены в jar-файл, то 
    * Открываем ru.hzerr.util.ProjectUpdater
    * Меняем CHANGE_FILE_NAMES (например, CHANGE_FILE_NAMES = "com launcher buildnumber config.bin")
    * Запускаем ru.hzerr.util.ProjectUpdater.main()
6. Запустить ru.hzerr.util.Starter.main()

<b> Готово </b>