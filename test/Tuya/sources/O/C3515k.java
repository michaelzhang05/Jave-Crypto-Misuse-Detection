package o;

import androidx.appcompat.widget.SearchView;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: o.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3515k implements SearchView.OnQueryTextListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3514j f36329a;

    public C3515k(C3514j c3514j) {
        this.f36329a = c3514j;
    }

    @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
    public boolean onQueryTextChange(String newText) {
        boolean z8;
        AbstractC3159y.i(newText, "newText");
        R7.a aVar = this.f36329a.f36328s;
        C3517m c3517m = null;
        if (aVar == null) {
            AbstractC3159y.y("switchAdapter");
            aVar = null;
        }
        C3517m c3517m2 = this.f36329a.f36326q;
        if (c3517m2 == null) {
            AbstractC3159y.y("viewModel");
        } else {
            c3517m = c3517m2;
        }
        List b8 = c3517m.b(newText);
        if (newText.length() > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        aVar.b(b8, z8);
        return true;
    }

    @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
    public boolean onQueryTextSubmit(String str) {
        return true;
    }
}
