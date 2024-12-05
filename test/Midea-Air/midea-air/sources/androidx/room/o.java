package androidx.room;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

/* compiled from: SQLiteCopyOpenHelper.java */
/* loaded from: classes.dex */
class o implements c.q.a.c {

    /* renamed from: f, reason: collision with root package name */
    private final Context f1690f;

    /* renamed from: g, reason: collision with root package name */
    private final String f1691g;

    /* renamed from: h, reason: collision with root package name */
    private final File f1692h;

    /* renamed from: i, reason: collision with root package name */
    private final int f1693i;

    /* renamed from: j, reason: collision with root package name */
    private final c.q.a.c f1694j;

    /* renamed from: k, reason: collision with root package name */
    private a f1695k;
    private boolean l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(Context context, String str, File file, int i2, c.q.a.c cVar) {
        this.f1690f = context;
        this.f1691g = str;
        this.f1692h = file;
        this.f1693i = i2;
        this.f1694j = cVar;
    }

    private void a(File file) throws IOException {
        ReadableByteChannel channel;
        if (this.f1691g != null) {
            channel = Channels.newChannel(this.f1690f.getAssets().open(this.f1691g));
        } else if (this.f1692h != null) {
            channel = new FileInputStream(this.f1692h).getChannel();
        } else {
            throw new IllegalStateException("copyFromAssetPath and copyFromFile == null!");
        }
        File createTempFile = File.createTempFile("room-copy-helper", ".tmp", this.f1690f.getCacheDir());
        createTempFile.deleteOnExit();
        androidx.room.t.d.a(channel, new FileOutputStream(createTempFile).getChannel());
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        }
        if (createTempFile.renameTo(file)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + createTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
    }

    private void f() {
        String databaseName = getDatabaseName();
        File databasePath = this.f1690f.getDatabasePath(databaseName);
        a aVar = this.f1695k;
        androidx.room.t.a aVar2 = new androidx.room.t.a(databaseName, this.f1690f.getFilesDir(), aVar == null || aVar.f1619j);
        try {
            aVar2.b();
            if (!databasePath.exists()) {
                try {
                    a(databasePath);
                    aVar2.c();
                    return;
                } catch (IOException e2) {
                    throw new RuntimeException("Unable to copy database file.", e2);
                }
            }
            if (this.f1695k == null) {
                aVar2.c();
                return;
            }
            try {
                int c2 = androidx.room.t.c.c(databasePath);
                int i2 = this.f1693i;
                if (c2 == i2) {
                    aVar2.c();
                    return;
                }
                if (this.f1695k.a(c2, i2)) {
                    aVar2.c();
                    return;
                }
                if (this.f1690f.deleteDatabase(databaseName)) {
                    try {
                        a(databasePath);
                    } catch (IOException e3) {
                        Log.w("ROOM", "Unable to copy database file.", e3);
                    }
                } else {
                    Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                }
                aVar2.c();
                return;
            } catch (IOException e4) {
                Log.w("ROOM", "Unable to read database version.", e4);
                aVar2.c();
                return;
            }
        } catch (Throwable th) {
            aVar2.c();
            throw th;
        }
        aVar2.c();
        throw th;
    }

    @Override // c.q.a.c
    public synchronized c.q.a.b N() {
        if (!this.l) {
            f();
            this.l = true;
        }
        return this.f1694j.N();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(a aVar) {
        this.f1695k = aVar;
    }

    @Override // c.q.a.c, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f1694j.close();
        this.l = false;
    }

    @Override // c.q.a.c
    public String getDatabaseName() {
        return this.f1694j.getDatabaseName();
    }

    @Override // c.q.a.c
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.f1694j.setWriteAheadLoggingEnabled(z);
    }
}
