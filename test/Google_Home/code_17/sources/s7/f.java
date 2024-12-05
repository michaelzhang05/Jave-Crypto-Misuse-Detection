package S7;

import M7.n;
import P5.AbstractC1378t;
import androidx.lifecycle.ViewModel;
import com.inmobi.cmp.ChoiceCmpCallback;
import com.inmobi.cmp.data.storage.SharedStorage;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class f extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    public final SharedStorage f9959a;

    /* renamed from: b, reason: collision with root package name */
    public final ChoiceCmpCallback f9960b;

    /* renamed from: c, reason: collision with root package name */
    public final M7.a f9961c;

    /* renamed from: d, reason: collision with root package name */
    public final H6.f f9962d;

    /* renamed from: e, reason: collision with root package name */
    public final K7.g f9963e;

    /* renamed from: f, reason: collision with root package name */
    public final J5.c f9964f;

    public f(SharedStorage sharedStorage, ChoiceCmpCallback choiceCmpCallback, M7.a screenTexts, H6.f fVar, K7.g tracking, J5.c gbcPurposeResponse) {
        AbstractC3255y.i(sharedStorage, "sharedStorage");
        AbstractC3255y.i(screenTexts, "screenTexts");
        AbstractC3255y.i(tracking, "tracking");
        AbstractC3255y.i(gbcPurposeResponse, "gbcPurposeResponse");
        this.f9959a = sharedStorage;
        this.f9960b = choiceCmpCallback;
        this.f9961c = screenTexts;
        this.f9962d = fVar;
        this.f9963e = tracking;
        this.f9964f = gbcPurposeResponse;
    }

    public final String a() {
        H6.a aVar;
        String str;
        H6.f fVar = this.f9962d;
        if (fVar == null || (aVar = fVar.f3925b) == null || (str = aVar.f3868E) == null) {
            return "";
        }
        return str;
    }

    public final String b() {
        n nVar;
        String str;
        H6.f fVar = this.f9962d;
        if (fVar == null || (nVar = fVar.f3929f) == null || (str = nVar.f7402h) == null) {
            return "";
        }
        return str;
    }

    public final boolean c() {
        H6.f fVar;
        H6.a aVar;
        String str;
        if (b().length() > 0 && (fVar = this.f9962d) != null && (aVar = fVar.f3925b) != null && (str = aVar.f3868E) != null && str.length() > 0) {
            return true;
        }
        return false;
    }

    public final String d() {
        if (!this.f9961c.f7242b.isEmpty()) {
            return (String) AbstractC1378t.m0(this.f9961c.f7242b);
        }
        return "";
    }

    public final boolean e() {
        boolean z8;
        H6.a aVar;
        H6.f fVar = this.f9962d;
        if (fVar != null && (aVar = fVar.f3925b) != null && aVar.f3866C) {
            z8 = true;
        } else {
            z8 = false;
        }
        return !z8;
    }

    public final String f() {
        H6.a aVar;
        String str;
        H6.f fVar = this.f9962d;
        if (fVar == null || (aVar = fVar.f3925b) == null || (str = aVar.f3867D) == null) {
            return "";
        }
        return str;
    }

    public final String g() {
        n nVar;
        String str;
        H6.f fVar = this.f9962d;
        if (fVar == null || (nVar = fVar.f3929f) == null || (str = nVar.f7401g) == null) {
            return "";
        }
        return str;
    }

    public final boolean h() {
        H6.f fVar;
        H6.a aVar;
        String str;
        if (g().length() > 0 && (fVar = this.f9962d) != null && (aVar = fVar.f3925b) != null && (str = aVar.f3867D) != null && str.length() > 0) {
            return true;
        }
        return false;
    }

    public final String i() {
        H6.a aVar;
        String str;
        H6.f fVar = this.f9962d;
        if (fVar == null || (aVar = fVar.f3925b) == null || (str = aVar.f3869F) == null) {
            return "";
        }
        return str;
    }

    public final String j() {
        n nVar;
        String str;
        H6.f fVar = this.f9962d;
        if (fVar == null || (nVar = fVar.f3929f) == null || (str = nVar.f7400f) == null) {
            return "";
        }
        return str;
    }

    public final boolean k() {
        H6.f fVar;
        H6.a aVar;
        String str;
        if (j().length() > 0 && (fVar = this.f9962d) != null && (aVar = fVar.f3925b) != null && (str = aVar.f3869F) != null && str.length() > 0) {
            return true;
        }
        return false;
    }
}
