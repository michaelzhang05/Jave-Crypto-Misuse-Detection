package cm.aptoide.pt.install.remote;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import i.a.a;
import i.a.c;
import i.a.d;
import i.a.e;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* loaded from: classes.dex */
public class RemoteInstallationSenderManager {
    static final int DISCOVERY_TO = 20000;
    static final String INVALID_PAYLOAD_RESPONSE = "INVALIDPAYLOAD";
    static final String PAYLOAD_TAG = "apkinstall_appid=";
    static final String SERVER_TAG_TO_REMOVE = ".local.";
    static final String SERVICE_TYPE = "_aptoide-rmtinst._tcp.local.";
    static final String SUCCESS_TAG = "receivedpayload=";
    static final String TAG = "RemoteInstallationSenderManager";
    static final int TIMEOUT = 10000;
    SocketClientThread clientServerThread;
    Context context;
    Handler handler = new Handler();
    a jmDNS;
    RemoteInstallationSenderListener listener;
    WifiManager.MulticastLock multicastLock;

    /* renamed from: cm.aptoide.pt.install.remote.RemoteInstallationSenderManager$1, reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass1 implements Runnable {
        AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                WifiManager wifiManager = (WifiManager) RemoteInstallationSenderManager.this.context.getSystemService("wifi");
                RemoteInstallationSenderManager remoteInstallationSenderManager = RemoteInstallationSenderManager.this;
                remoteInstallationSenderManager.multicastLock = wifiManager.createMulticastLock(remoteInstallationSenderManager.context.getClass().getName());
                RemoteInstallationSenderManager.this.multicastLock.setReferenceCounted(true);
                RemoteInstallationSenderManager.this.multicastLock.acquire();
                RemoteInstallationSenderManager remoteInstallationSenderManager2 = RemoteInstallationSenderManager.this;
                remoteInstallationSenderManager2.jmDNS = a.i0(remoteInstallationSenderManager2.getAddress(), Build.MODEL);
                RemoteInstallationSenderManager.this.jmDNS.g0(RemoteInstallationSenderManager.SERVICE_TYPE, new e() { // from class: cm.aptoide.pt.install.remote.RemoteInstallationSenderManager.1.1
                    @Override // i.a.e
                    public void serviceAdded(c cVar) {
                        Log.i(RemoteInstallationSenderManager.TAG, "Remote Installation - A service has been added: " + cVar.d());
                    }

                    @Override // i.a.e
                    public void serviceRemoved(c cVar) {
                        d d2 = cVar.d();
                        final Inet4Address inet4Address = d2.g()[0];
                        final int k2 = d2.k();
                        final String p = d2.p();
                        if (p.contains(RemoteInstallationSenderManager.SERVER_TAG_TO_REMOVE)) {
                            p = p.substring(0, p.length() - 7);
                        }
                        Log.i(RemoteInstallationSenderManager.TAG, "Remote Installation - A service has been removed: " + cVar.d());
                        RemoteInstallationSenderManager.this.runOnUiThread(new Runnable() { // from class: cm.aptoide.pt.install.remote.RemoteInstallationSenderManager.1.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                RemoteInstallationSenderManager.this.listener.onAptoideTVServiceLost(new ReceiverDevice(p, inet4Address, k2));
                            }
                        });
                    }

                    @Override // i.a.e
                    public void serviceResolved(c cVar) {
                        d d2 = cVar.d();
                        final Inet4Address inet4Address = d2.g()[0];
                        final int k2 = d2.k();
                        final String p = d2.p();
                        if (p.contains(RemoteInstallationSenderManager.SERVER_TAG_TO_REMOVE)) {
                            p = p.substring(0, p.length() - 7);
                        }
                        Log.i(RemoteInstallationSenderManager.TAG, "Remote Installation - A service has been resolved: " + cVar.d());
                        RemoteInstallationSenderManager.this.runOnUiThread(new Runnable() { // from class: cm.aptoide.pt.install.remote.RemoteInstallationSenderManager.1.1.2
                            @Override // java.lang.Runnable
                            public void run() {
                                RemoteInstallationSenderManager.this.listener.onAptoideTVServiceFound(new ReceiverDevice(p, inet4Address, k2));
                            }
                        });
                    }
                });
                RemoteInstallationSenderManager.this.runOnUiThread(new Runnable() { // from class: cm.aptoide.pt.install.remote.RemoteInstallationSenderManager.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        RemoteInstallationSenderManager.this.listener.onDiscoveryStarted();
                    }
                });
            } catch (IOException e2) {
                RemoteInstallationSenderManager.this.runOnUiThread(new Runnable() { // from class: cm.aptoide.pt.install.remote.RemoteInstallationSenderManager.1.3
                    @Override // java.lang.Runnable
                    public void run() {
                        RemoteInstallationSenderManager.this.listener.onNoNetworkAccess();
                    }
                });
                Log.i(RemoteInstallationSenderManager.TAG, "Remote Installation - Error on discover: " + e2);
            }
        }
    }

    /* loaded from: classes.dex */
    private class SocketClientThread extends AsyncTask<Void, Void, Boolean> {
        private String app;
        private ReceiverDevice device;

        public SocketClientThread(ReceiverDevice receiverDevice, String str) {
            this.device = receiverDevice;
            this.app = str;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Removed duplicated region for block: B:104:? A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:87:0x01b9  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x01da  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x01df A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // android.os.AsyncTask
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Boolean doInBackground(java.lang.Void... r10) {
            /*
                Method dump skipped, instructions count: 505
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: cm.aptoide.pt.install.remote.RemoteInstallationSenderManager.SocketClientThread.doInBackground(java.lang.Void[]):java.lang.Boolean");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(Boolean bool) {
            if (bool.booleanValue()) {
                RemoteInstallationSenderManager.this.listener.onAppSendSuccess();
            } else {
                RemoteInstallationSenderManager.this.listener.onAppSendUnsuccess();
            }
            super.onPostExecute((SocketClientThread) bool);
        }
    }

    public RemoteInstallationSenderManager(Context context) {
        this.context = context;
    }

    public void discoverAptoideTVServices(RemoteInstallationSenderListener remoteInstallationSenderListener) {
        this.listener = remoteInstallationSenderListener;
        new Thread(new AnonymousClass1()).start();
        runOnUiThread(new Runnable() { // from class: cm.aptoide.pt.install.remote.RemoteInstallationSenderManager.2
            @Override // java.lang.Runnable
            public void run() {
                RemoteInstallationSenderManager.this.stopDiscoveringAptoideTVServices();
            }
        }, 20000L);
    }

    InetAddress getAddress() throws UnknownHostException {
        int ipAddress = ((WifiManager) this.context.getSystemService("wifi")).getConnectionInfo().getIpAddress();
        return InetAddress.getByAddress(new byte[]{(byte) (ipAddress & 255), (byte) ((ipAddress >> 8) & 255), (byte) ((ipAddress >> 16) & 255), (byte) ((ipAddress >> 24) & 255)});
    }

    void runOnUiThread(Runnable runnable) {
        this.handler.post(runnable);
    }

    public void sendAppId(ReceiverDevice receiverDevice, String str) {
        SocketClientThread socketClientThread = new SocketClientThread(receiverDevice, str);
        this.clientServerThread = socketClientThread;
        socketClientThread.execute(new Void[0]);
    }

    public void stopDiscoveringAptoideTVServices() {
        new AsyncTask<Void, Void, Void>() { // from class: cm.aptoide.pt.install.remote.RemoteInstallationSenderManager.3
            private boolean closed = false;

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            public Void doInBackground(Void... voidArr) {
                try {
                    a aVar = RemoteInstallationSenderManager.this.jmDNS;
                    if (aVar != null) {
                        aVar.k0();
                        RemoteInstallationSenderManager.this.jmDNS.close();
                        this.closed = true;
                        RemoteInstallationSenderManager.this.jmDNS = null;
                    }
                    WifiManager.MulticastLock multicastLock = RemoteInstallationSenderManager.this.multicastLock;
                    if (multicastLock != null) {
                        multicastLock.release();
                        RemoteInstallationSenderManager.this.multicastLock = null;
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                return null;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            public void onPostExecute(Void r2) {
                if (this.closed) {
                    RemoteInstallationSenderManager.this.listener.onDiscoveryStopped();
                }
                super.onPostExecute((AnonymousClass3) r2);
            }
        }.execute(null);
    }

    void runOnUiThread(Runnable runnable, long j2) {
        this.handler.postDelayed(runnable, j2);
    }
}
