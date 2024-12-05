package c.q.a;

import android.database.Cursor;
import android.database.SQLException;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;

/* compiled from: SupportSQLiteDatabase.java */
/* loaded from: classes.dex */
public interface b extends Closeable {
    void G();

    void I(String str, Object[] objArr) throws SQLException;

    Cursor O(String str);

    void S();

    Cursor Z(e eVar);

    String c();

    boolean e0();

    void g();

    List<Pair<String, String>> i();

    boolean isOpen();

    void l(String str) throws SQLException;

    f q(String str);

    Cursor v(e eVar, CancellationSignal cancellationSignal);
}
