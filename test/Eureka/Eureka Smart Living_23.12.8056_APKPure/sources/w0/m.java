package w0;

import android.content.Context;
import java.io.File;
import java.io.FileNotFoundException;
import net.sqlcipher.database.SQLiteDatabase;
import net.sqlcipher.database.SQLiteStatement;

/* loaded from: classes.dex */
public class m {

    /* loaded from: classes.dex */
    public enum a {
        DOES_NOT_EXIST,
        UNENCRYPTED,
        ENCRYPTED_SECRET,
        ENCRYPTED_GLOBAL_SECRET,
        UNKNOWN
    }

    public void a(Context context, File file, String str, String str2) {
        SQLiteDatabase.Z(context);
        if (!file.exists()) {
            throw new FileNotFoundException(file.getAbsolutePath() + " not found");
        }
        SQLiteDatabase e02 = SQLiteDatabase.e0(file.getAbsolutePath(), str, null, 0);
        if (e02.k()) {
            e02.N(str2);
            e02.close();
        } else {
            throw new l5.c("database " + file.getAbsolutePath() + " open failed");
        }
    }

    public void b(Context context, File file, byte[] bArr) {
        SQLiteDatabase.Z(context);
        if (!file.exists()) {
            throw new FileNotFoundException(file.getAbsolutePath() + " not found");
        }
        File createTempFile = File.createTempFile("sqlcipherutils", "tmp", context.getCacheDir());
        SQLiteDatabase e02 = SQLiteDatabase.e0(createTempFile.getAbsolutePath(), "", null, 0);
        SQLiteDatabase e03 = SQLiteDatabase.e0(file.getAbsolutePath(), new String(bArr), null, 0);
        e02.n(e03.y());
        e02.close();
        SQLiteStatement u5 = e03.u("ATTACH DATABASE ? AS plaintext KEY '';");
        u5.p(1, createTempFile.getAbsolutePath());
        u5.I();
        e03.o0("SELECT sqlcipher_export('plaintext');");
        e03.o0("DETACH DATABASE plaintext;");
        u5.close();
        e03.close();
        if (!file.delete()) {
            throw new FileNotFoundException(file.getAbsolutePath() + " not deleted");
        }
        if (createTempFile.renameTo(file)) {
            return;
        }
        throw new FileNotFoundException(file.getAbsolutePath() + " not renamed");
    }

    public void c(Context context, File file, byte[] bArr) {
        SQLiteDatabase.Z(context);
        if (!file.exists()) {
            throw new FileNotFoundException(file.getAbsolutePath() + " not found");
        }
        File createTempFile = File.createTempFile("sqlcipherutils", "tmp", context.getCacheDir());
        SQLiteDatabase e02 = SQLiteDatabase.e0(file.getAbsolutePath(), "", null, 0);
        int y5 = e02.y();
        e02.close();
        SQLiteDatabase h02 = SQLiteDatabase.h0(createTempFile.getAbsolutePath(), bArr, null, 0, null, null);
        SQLiteStatement u5 = h02.u("ATTACH DATABASE ? AS plaintext KEY '';");
        u5.p(1, file.getAbsolutePath());
        u5.I();
        h02.o0("SELECT sqlcipher_export('main', 'plaintext');");
        h02.o0("DETACH DATABASE plaintext;");
        h02.n(y5);
        u5.close();
        h02.close();
        if (!file.delete()) {
            throw new FileNotFoundException(file.getAbsolutePath() + " not deleted");
        }
        if (createTempFile.renameTo(file)) {
            return;
        }
        throw new FileNotFoundException(file.getAbsolutePath() + " not renamed");
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0047: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:50:0x0047 */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public w0.m.a d(android.content.Context r5, java.io.File r6, android.content.SharedPreferences r7, w0.d r8) {
        /*
            r4 = this;
            java.lang.String r0 = ""
            net.sqlcipher.database.SQLiteDatabase.Z(r5)
            boolean r5 = r6.exists()
            if (r5 == 0) goto L7b
            r5 = 1
            r1 = 0
            java.lang.String r2 = r6.getAbsolutePath()     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L20
            net.sqlcipher.database.SQLiteDatabase r2 = net.sqlcipher.database.SQLiteDatabase.e0(r2, r0, r1, r5)     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L20
            r2.y()     // Catch: java.lang.Exception -> L21 java.lang.Throwable -> L46
            w0.m$a r5 = w0.m.a.UNENCRYPTED     // Catch: java.lang.Exception -> L21 java.lang.Throwable -> L46
            r2.close()
            return r5
        L1e:
            r5 = move-exception
            goto L75
        L20:
            r2 = r1
        L21:
            java.lang.String r3 = "secret"
            java.lang.String r7 = r7.getString(r3, r0)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L49
            int r0 = r7.length()     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L49
            if (r0 <= 0) goto L3e
            java.lang.String r0 = r6.getAbsolutePath()     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L49
            net.sqlcipher.database.SQLiteDatabase r2 = net.sqlcipher.database.SQLiteDatabase.e0(r0, r7, r1, r5)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L49
            r2.y()     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L49
            w0.m$a r5 = w0.m.a.ENCRYPTED_SECRET     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L49
            r2.close()
            return r5
        L3e:
            w0.m$a r5 = w0.m.a.UNKNOWN     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L49
            if (r2 == 0) goto L45
            r2.close()
        L45:
            return r5
        L46:
            r5 = move-exception
            r1 = r2
            goto L75
        L49:
            java.lang.String r7 = r8.f9706a     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L6c
            int r7 = r7.length()     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L6c
            if (r7 <= 0) goto L64
            java.lang.String r6 = r6.getAbsolutePath()     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L6c
            java.lang.String r7 = r8.f9706a     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L6c
            net.sqlcipher.database.SQLiteDatabase r1 = net.sqlcipher.database.SQLiteDatabase.e0(r6, r7, r1, r5)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L6c
            r1.y()     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L6d
            w0.m$a r5 = w0.m.a.ENCRYPTED_GLOBAL_SECRET     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L6d
            r1.close()
            return r5
        L64:
            w0.m$a r5 = w0.m.a.UNKNOWN     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L6c
            if (r2 == 0) goto L6b
            r2.close()
        L6b:
            return r5
        L6c:
            r1 = r2
        L6d:
            w0.m$a r5 = w0.m.a.UNKNOWN     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L74
            r1.close()
        L74:
            return r5
        L75:
            if (r1 == 0) goto L7a
            r1.close()
        L7a:
            throw r5
        L7b:
            w0.m$a r5 = w0.m.a.DOES_NOT_EXIST
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.m.d(android.content.Context, java.io.File, android.content.SharedPreferences, w0.d):w0.m$a");
    }
}
