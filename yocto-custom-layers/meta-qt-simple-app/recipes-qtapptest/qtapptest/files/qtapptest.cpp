#include <QApplication>
#include <QLabel>
#include <QWidget>

int main(int argc, char *argv[])
{
    QApplication app(argc, argv);
    QLabel messageLabel("<center>Hello Qt Embedded App!");
    messageLabel.setWindowTitle("Qt Embedded App");
    messageLabel.resize(200, 100);
    messageLabel.show();
    return app.exec();
}