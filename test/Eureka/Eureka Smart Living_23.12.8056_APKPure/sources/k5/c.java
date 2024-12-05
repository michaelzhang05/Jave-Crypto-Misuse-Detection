package k5;

import android.database.CrossProcessCursor;
import android.database.CursorWindow;

/* loaded from: classes.dex */
public class c extends g implements CrossProcessCursor {
    public c(d dVar) {
        super(dVar);
    }

    @Override // android.database.CrossProcessCursor
    public void fillWindow(int i6, CursorWindow cursorWindow) {
        i.a(this, i6, cursorWindow);
    }

    @Override // android.database.CrossProcessCursor
    public CursorWindow getWindow() {
        return null;
    }

    @Override // android.database.CrossProcessCursor
    public boolean onMove(int i6, int i7) {
        return true;
    }
}
