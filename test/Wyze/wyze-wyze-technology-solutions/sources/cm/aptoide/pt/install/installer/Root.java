package cm.aptoide.pt.install.installer;

import android.util.Log;
import cm.aptoide.pt.install.InstallAnalytics;
import cm.aptoide.pt.logger.Logger;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/* loaded from: classes.dex */
public class Root {
    private static final String TAG = "Root";
    private BufferedReader mErrorReader;
    private boolean mIsAcquired;
    private boolean mIsTerminated;
    private BufferedReader mReader;
    private Process mSuProcess;
    private BufferedWriter mWriter;

    public Root() {
        this.mIsAcquired = true;
        try {
            this.mSuProcess = Runtime.getRuntime().exec("su");
            this.mWriter = new BufferedWriter(new OutputStreamWriter(this.mSuProcess.getOutputStream()));
            this.mReader = new BufferedReader(new InputStreamReader(this.mSuProcess.getInputStream()));
            this.mErrorReader = new BufferedReader(new InputStreamReader(this.mSuProcess.getErrorStream()));
            exec("echo test");
        } catch (IOException e2) {
            this.mIsAcquired = false;
            this.mIsTerminated = true;
            Log.w(TAG, "Unable to acquire root access: ");
            Log.w(TAG, e2);
        }
    }

    public static boolean requestRoot() {
        try {
            Process exec = Runtime.getRuntime().exec("su -c exit");
            exec.waitFor();
            return exec.exitValue() == 0;
        } catch (Exception e2) {
            Log.w(TAG, "Unable to acquire root access: ");
            Log.w(TAG, e2);
            return false;
        }
    }

    public String exec(String str) {
        int indexOf;
        Logger.getInstance().d(InstallAnalytics.RAKAM_INSTALL_EVENT, "executing command : " + str);
        try {
            StringBuilder sb = new StringBuilder();
            this.mWriter.write(str + "\necho 『BREAKER』\n");
            this.mWriter.flush();
            char[] cArr = new char[256];
            do {
                sb.append(cArr, 0, this.mReader.read(cArr));
                indexOf = sb.indexOf("『BREAKER』");
            } while (indexOf == -1);
            sb.delete(indexOf, indexOf + 9);
            return sb.toString().trim();
        } catch (Exception e2) {
            this.mIsAcquired = false;
            this.mIsTerminated = true;
            Log.w(TAG, "Unable execute command: ");
            Log.w(TAG, e2);
            return null;
        }
    }

    public boolean isAcquired() {
        return this.mIsAcquired;
    }

    public boolean isTerminated() {
        return this.mIsTerminated;
    }

    public String readError() {
        int indexOf;
        try {
            StringBuilder sb = new StringBuilder();
            this.mWriter.write("echo 『BREAKER』 >&2\n");
            this.mWriter.flush();
            char[] cArr = new char[256];
            do {
                sb.append(cArr, 0, this.mErrorReader.read(cArr));
                indexOf = sb.indexOf("『BREAKER』");
            } while (indexOf == -1);
            sb.delete(indexOf, indexOf + 9);
            return sb.toString().trim();
        } catch (Exception e2) {
            this.mIsAcquired = false;
            this.mIsTerminated = true;
            Log.w(TAG, "Unable execute command: ");
            Log.w(TAG, e2);
            return null;
        }
    }

    public void terminate() {
        if (this.mIsTerminated) {
            return;
        }
        this.mIsTerminated = true;
        this.mSuProcess.destroy();
    }
}
