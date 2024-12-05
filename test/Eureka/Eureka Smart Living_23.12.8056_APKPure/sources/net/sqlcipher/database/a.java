package net.sqlcipher.database;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private int f8089a = 1;

    /* renamed from: b, reason: collision with root package name */
    private Object f8090b = new Object();

    private String q() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append(" (");
        if (!(this instanceof SQLiteDatabase)) {
            if ((this instanceof SQLiteProgram) || (this instanceof SQLiteStatement) || (this instanceof SQLiteQuery)) {
                sb.append("mSql = ");
                str = ((SQLiteProgram) this).f8081d;
            }
            sb.append(") ");
            return sb.toString();
        }
        sb.append("database = ");
        str = ((SQLiteDatabase) this).W();
        sb.append(str);
        sb.append(") ");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void D() {
    }

    public void G() {
        synchronized (this.f8090b) {
            int i6 = this.f8089a - 1;
            this.f8089a = i6;
            if (i6 == 0) {
                w();
            }
        }
    }

    public void g() {
        synchronized (this.f8090b) {
            int i6 = this.f8089a;
            if (i6 <= 0) {
                throw new IllegalStateException("attempt to re-open an already-closed object: " + q());
            }
            this.f8089a = i6 + 1;
        }
    }

    protected abstract void w();
}
