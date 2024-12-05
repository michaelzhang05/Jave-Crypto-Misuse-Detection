package k5;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObservable;
import android.database.ContentObserver;
import android.database.CrossProcessCursor;
import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class a implements CrossProcessCursor, d {

    /* renamed from: h, reason: collision with root package name */
    protected ContentResolver f7198h;

    /* renamed from: j, reason: collision with root package name */
    private Uri f7200j;

    /* renamed from: k, reason: collision with root package name */
    private ContentObserver f7201k;

    /* renamed from: m, reason: collision with root package name */
    private boolean f7203m;

    /* renamed from: a, reason: collision with root package name */
    DataSetObservable f7191a = new DataSetObservable();

    /* renamed from: b, reason: collision with root package name */
    ContentObservable f7192b = new ContentObservable();

    /* renamed from: c, reason: collision with root package name */
    private Bundle f7193c = Bundle.EMPTY;

    /* renamed from: i, reason: collision with root package name */
    protected boolean f7199i = false;

    /* renamed from: l, reason: collision with root package name */
    private final Object f7202l = new Object();

    /* renamed from: f, reason: collision with root package name */
    protected int f7196f = -1;

    /* renamed from: e, reason: collision with root package name */
    protected int f7195e = -1;

    /* renamed from: g, reason: collision with root package name */
    protected Long f7197g = null;

    /* renamed from: d, reason: collision with root package name */
    protected HashMap f7194d = new HashMap();

    /* renamed from: k5.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    protected static class C0111a extends ContentObserver {

        /* renamed from: a, reason: collision with root package name */
        WeakReference f7204a;

        public C0111a(a aVar) {
            super(null);
            this.f7204a = new WeakReference(aVar);
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return false;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z5) {
            a aVar = (a) this.f7204a.get();
            if (aVar != null) {
                aVar.H(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean D(int i6) {
        Map map;
        return this.f7195e != -1 && this.f7194d.size() > 0 && (map = (Map) this.f7194d.get(this.f7197g)) != null && map.containsKey(getColumnNames()[i6]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void G() {
        this.f7191a.notifyChanged();
    }

    protected void H(boolean z5) {
        synchronized (this.f7202l) {
            this.f7192b.dispatchChange(z5);
            Uri uri = this.f7200j;
            if (uri != null && z5) {
                this.f7198h.notifyChange(uri, this.f7201k);
            }
        }
    }

    @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f7199i = true;
        this.f7192b.unregisterAll();
        q();
    }

    @Override // android.database.Cursor
    public void copyStringToBuffer(int i6, CharArrayBuffer charArrayBuffer) {
        String string = getString(i6);
        if (string == null) {
            charArrayBuffer.sizeCopied = 0;
            return;
        }
        char[] cArr = charArrayBuffer.data;
        if (cArr == null || cArr.length < string.length()) {
            charArrayBuffer.data = string.toCharArray();
        } else {
            string.getChars(0, string.length(), cArr, 0);
        }
        charArrayBuffer.sizeCopied = string.length();
    }

    @Override // android.database.Cursor
    public void deactivate() {
        q();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void finalize() {
        ContentObserver contentObserver = this.f7201k;
        if (contentObserver == null || !this.f7203m) {
            return;
        }
        this.f7198h.unregisterContentObserver(contentObserver);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void g() {
        if (-1 == this.f7196f || getCount() == this.f7196f) {
            throw new e(this.f7196f, getCount());
        }
    }

    @Override // android.database.Cursor
    public int getColumnCount() {
        return getColumnNames().length;
    }

    @Override // android.database.Cursor
    public abstract int getColumnIndex(String str);

    @Override // android.database.Cursor
    public int getColumnIndexOrThrow(String str) {
        int columnIndex = getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist");
    }

    @Override // android.database.Cursor
    public String getColumnName(int i6) {
        return getColumnNames()[i6];
    }

    @Override // android.database.Cursor
    public abstract String[] getColumnNames();

    @Override // android.database.Cursor
    public abstract int getCount();

    @Override // android.database.Cursor
    public Bundle getExtras() {
        return this.f7193c;
    }

    @Override // android.database.Cursor
    public abstract long getLong(int i6);

    @Override // android.database.Cursor
    public Uri getNotificationUri() {
        return this.f7200j;
    }

    @Override // android.database.Cursor
    public final int getPosition() {
        return this.f7196f;
    }

    @Override // android.database.Cursor
    public abstract String getString(int i6);

    @Override // android.database.Cursor
    public boolean getWantsAllOnMoveCalls() {
        return false;
    }

    @Override // android.database.Cursor
    public final boolean isAfterLast() {
        return getCount() == 0 || this.f7196f == getCount();
    }

    @Override // android.database.Cursor
    public final boolean isBeforeFirst() {
        return getCount() == 0 || this.f7196f == -1;
    }

    @Override // android.database.Cursor
    public boolean isClosed() {
        return this.f7199i;
    }

    @Override // android.database.Cursor
    public final boolean isFirst() {
        return this.f7196f == 0 && getCount() != 0;
    }

    @Override // android.database.Cursor
    public final boolean isLast() {
        int count = getCount();
        return this.f7196f == count + (-1) && count != 0;
    }

    @Override // android.database.Cursor
    public final boolean move(int i6) {
        return moveToPosition(this.f7196f + i6);
    }

    @Override // android.database.Cursor
    public final boolean moveToFirst() {
        return moveToPosition(0);
    }

    @Override // android.database.Cursor
    public final boolean moveToLast() {
        return moveToPosition(getCount() - 1);
    }

    @Override // android.database.Cursor
    public final boolean moveToNext() {
        return moveToPosition(this.f7196f + 1);
    }

    @Override // android.database.Cursor
    public final boolean moveToPosition(int i6) {
        int count = getCount();
        if (i6 >= count) {
            this.f7196f = count;
            return false;
        }
        if (i6 < 0) {
            this.f7196f = -1;
            return false;
        }
        int i7 = this.f7196f;
        if (i6 == i7) {
            return true;
        }
        boolean onMove = onMove(i7, i6);
        if (onMove) {
            this.f7196f = i6;
            int i8 = this.f7195e;
            if (i8 != -1) {
                this.f7197g = Long.valueOf(getLong(i8));
            }
        } else {
            this.f7196f = -1;
        }
        return onMove;
    }

    @Override // android.database.Cursor
    public final boolean moveToPrevious() {
        return moveToPosition(this.f7196f - 1);
    }

    @Override // android.database.CrossProcessCursor
    public abstract boolean onMove(int i6, int i7);

    public void q() {
        ContentObserver contentObserver = this.f7201k;
        if (contentObserver != null) {
            this.f7198h.unregisterContentObserver(contentObserver);
            this.f7203m = false;
        }
        this.f7191a.notifyInvalidated();
    }

    @Override // android.database.Cursor
    public void registerContentObserver(ContentObserver contentObserver) {
        this.f7192b.registerObserver(contentObserver);
    }

    @Override // android.database.Cursor
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.f7191a.registerObserver(dataSetObserver);
    }

    @Override // android.database.Cursor
    public boolean requery() {
        ContentObserver contentObserver = this.f7201k;
        if (contentObserver != null && !this.f7203m) {
            this.f7198h.registerContentObserver(this.f7200j, true, contentObserver);
            this.f7203m = true;
        }
        this.f7191a.notifyChanged();
        return true;
    }

    @Override // android.database.Cursor
    public Bundle respond(Bundle bundle) {
        return Bundle.EMPTY;
    }

    @Override // android.database.Cursor
    public void setExtras(Bundle bundle) {
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        this.f7193c = bundle;
    }

    @Override // android.database.Cursor
    public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
        synchronized (this.f7202l) {
            this.f7200j = uri;
            this.f7198h = contentResolver;
            ContentObserver contentObserver = this.f7201k;
            if (contentObserver != null) {
                contentResolver.unregisterContentObserver(contentObserver);
            }
            C0111a c0111a = new C0111a(this);
            this.f7201k = c0111a;
            this.f7198h.registerContentObserver(this.f7200j, true, c0111a);
            this.f7203m = true;
        }
    }

    @Override // android.database.Cursor
    public void unregisterContentObserver(ContentObserver contentObserver) {
        if (this.f7199i) {
            return;
        }
        this.f7192b.unregisterObserver(contentObserver);
    }

    @Override // android.database.Cursor
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.f7191a.unregisterObserver(dataSetObserver);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object w(int i6) {
        return ((Map) this.f7194d.get(this.f7197g)).get(getColumnNames()[i6]);
    }
}
