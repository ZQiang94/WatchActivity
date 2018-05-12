package zqiang94.github.io.watchactivity;

class RunView implements Runnable {
    final timer mtimer;

    RunView(timer mtimer) {
        this.mtimer = mtimer;
    }

    public void run() {
        ViewWindow.showView(this.mtimer.mWatchingService, this.mtimer.mWatchingService.serviceName);
    }
}