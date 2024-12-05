package E5;

import androidx.appcompat.widget.SearchView;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class i implements SearchView.OnQueryTextListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f2607a;

    public i(h hVar) {
        this.f2607a = hVar;
    }

    @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
    public boolean onQueryTextChange(String newText) {
        boolean z8;
        AbstractC3255y.i(newText, "newText");
        U7.a aVar = this.f2607a.f2606p;
        l lVar = null;
        if (aVar == null) {
            AbstractC3255y.y("switchAdapter");
            aVar = null;
        }
        l lVar2 = this.f2607a.f2605o;
        if (lVar2 == null) {
            AbstractC3255y.y("viewModel");
        } else {
            lVar = lVar2;
        }
        List c8 = lVar.c(newText);
        if (newText.length() > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        aVar.b(c8, z8);
        return true;
    }

    @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
    public boolean onQueryTextSubmit(String str) {
        return true;
    }
}
