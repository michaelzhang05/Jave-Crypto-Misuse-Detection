package P7;

import J7.n;
import M5.AbstractC1246t;
import androidx.lifecycle.ViewModel;
import com.inmobi.cmp.ChoiceCmpCallback;
import com.inmobi.cmp.data.storage.SharedStorage;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class f extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    public final SharedStorage f8128a;

    /* renamed from: b, reason: collision with root package name */
    public final ChoiceCmpCallback f8129b;

    /* renamed from: c, reason: collision with root package name */
    public final J7.a f8130c;

    /* renamed from: d, reason: collision with root package name */
    public final E6.f f8131d;

    /* renamed from: e, reason: collision with root package name */
    public final H7.g f8132e;

    /* renamed from: f, reason: collision with root package name */
    public final G5.c f8133f;

    public f(SharedStorage sharedStorage, ChoiceCmpCallback choiceCmpCallback, J7.a screenTexts, E6.f fVar, H7.g tracking, G5.c gbcPurposeResponse) {
        AbstractC3159y.i(sharedStorage, "sharedStorage");
        AbstractC3159y.i(screenTexts, "screenTexts");
        AbstractC3159y.i(tracking, "tracking");
        AbstractC3159y.i(gbcPurposeResponse, "gbcPurposeResponse");
        this.f8128a = sharedStorage;
        this.f8129b = choiceCmpCallback;
        this.f8130c = screenTexts;
        this.f8131d = fVar;
        this.f8132e = tracking;
        this.f8133f = gbcPurposeResponse;
    }

    public final String a() {
        E6.a aVar;
        String str;
        E6.f fVar = this.f8131d;
        if (fVar == null || (aVar = fVar.f2375b) == null || (str = aVar.f2318E) == null) {
            return "";
        }
        return str;
    }

    public final String b() {
        n nVar;
        String str;
        E6.f fVar = this.f8131d;
        if (fVar == null || (nVar = fVar.f2379f) == null || (str = nVar.f5696h) == null) {
            return "";
        }
        return str;
    }

    public final boolean c() {
        E6.f fVar;
        E6.a aVar;
        String str;
        if (b().length() > 0 && (fVar = this.f8131d) != null && (aVar = fVar.f2375b) != null && (str = aVar.f2318E) != null && str.length() > 0) {
            return true;
        }
        return false;
    }

    public final String d() {
        if (!this.f8130c.f5536b.isEmpty()) {
            return (String) AbstractC1246t.m0(this.f8130c.f5536b);
        }
        return "";
    }

    public final boolean e() {
        boolean z8;
        E6.a aVar;
        E6.f fVar = this.f8131d;
        if (fVar != null && (aVar = fVar.f2375b) != null && aVar.f2316C) {
            z8 = true;
        } else {
            z8 = false;
        }
        return !z8;
    }

    public final String f() {
        E6.a aVar;
        String str;
        E6.f fVar = this.f8131d;
        if (fVar == null || (aVar = fVar.f2375b) == null || (str = aVar.f2317D) == null) {
            return "";
        }
        return str;
    }

    public final String g() {
        n nVar;
        String str;
        E6.f fVar = this.f8131d;
        if (fVar == null || (nVar = fVar.f2379f) == null || (str = nVar.f5695g) == null) {
            return "";
        }
        return str;
    }

    public final boolean h() {
        E6.f fVar;
        E6.a aVar;
        String str;
        if (g().length() > 0 && (fVar = this.f8131d) != null && (aVar = fVar.f2375b) != null && (str = aVar.f2317D) != null && str.length() > 0) {
            return true;
        }
        return false;
    }

    public final String i() {
        E6.a aVar;
        String str;
        E6.f fVar = this.f8131d;
        if (fVar == null || (aVar = fVar.f2375b) == null || (str = aVar.f2319F) == null) {
            return "";
        }
        return str;
    }

    public final String j() {
        n nVar;
        String str;
        E6.f fVar = this.f8131d;
        if (fVar == null || (nVar = fVar.f2379f) == null || (str = nVar.f5694f) == null) {
            return "";
        }
        return str;
    }

    public final boolean k() {
        E6.f fVar;
        E6.a aVar;
        String str;
        if (j().length() > 0 && (fVar = this.f8131d) != null && (aVar = fVar.f2375b) != null && (str = aVar.f2319F) != null && str.length() > 0) {
            return true;
        }
        return false;
    }
}
