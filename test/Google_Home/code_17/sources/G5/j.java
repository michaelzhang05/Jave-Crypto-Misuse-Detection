package G5;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.text.style.ClickableSpan;
import android.view.View;
import com.inmobi.cmp.model.ChoiceError;
import kotlin.jvm.internal.AbstractC3255y;
import y5.C4209b;

/* loaded from: classes5.dex */
public final class j extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f3403a;

    public j(f fVar) {
        this.f3403a = fVar;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        AbstractC3255y.i(view, "view");
        try {
            l lVar = this.f3403a.f3392h;
            l lVar2 = null;
            if (lVar == null) {
                AbstractC3255y.y("viewModel");
                lVar = null;
            }
            if (lVar.f3415h.f7327g.length() > 0) {
                f fVar = this.f3403a;
                Intent intent = new Intent("android.intent.action.VIEW");
                l lVar3 = this.f3403a.f3392h;
                if (lVar3 == null) {
                    AbstractC3255y.y("viewModel");
                } else {
                    lVar2 = lVar3;
                }
                intent.setData(Uri.parse(lVar2.f3415h.f7327g));
                fVar.startActivity(intent);
            }
        } catch (ActivityNotFoundException unused) {
            C4209b.b(C4209b.f41007a, ChoiceError.INVALID_URL, null, null, null, null, 30);
        }
    }
}
