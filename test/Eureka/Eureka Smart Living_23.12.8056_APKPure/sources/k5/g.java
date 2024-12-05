package k5;

import android.database.CursorWrapper;

/* loaded from: classes.dex */
public abstract class g extends CursorWrapper implements d {

    /* renamed from: a, reason: collision with root package name */
    private final d f7206a;

    public g(d dVar) {
        super(dVar);
        this.f7206a = dVar;
    }

    @Override // android.database.CursorWrapper
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public d getWrappedCursor() {
        return this.f7206a;
    }

    @Override // android.database.CursorWrapper, android.database.Cursor, k5.d
    public int getType(int i6) {
        return this.f7206a.getType(i6);
    }
}
