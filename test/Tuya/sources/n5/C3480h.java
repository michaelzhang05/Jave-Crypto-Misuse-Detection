package n5;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.uptodown.R;
import d2.EnumC2540d;
import d2.InterfaceC2541e;
import e2.AbstractC2577a;
import g2.C2710g;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: n5.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3480h extends AbstractC2577a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f36203a;

    /* renamed from: b, reason: collision with root package name */
    private C2710g f36204b;

    /* renamed from: c, reason: collision with root package name */
    private View f36205c;

    /* renamed from: d, reason: collision with root package name */
    private View f36206d;

    /* renamed from: e, reason: collision with root package name */
    private final View f36207e;

    /* renamed from: f, reason: collision with root package name */
    private final ImageView f36208f;

    public C3480h(View customPlayerUi, InterfaceC2541e youTubePlayer, Context context) {
        AbstractC3159y.i(customPlayerUi, "customPlayerUi");
        AbstractC3159y.i(youTubePlayer, "youTubePlayer");
        AbstractC3159y.i(context, "context");
        this.f36203a = context;
        this.f36206d = customPlayerUi;
        View findViewById = customPlayerUi.findViewById(R.id.v_player_panel_home);
        AbstractC3159y.h(findViewById, "playerUi.findViewById(R.id.v_player_panel_home)");
        this.f36207e = findViewById;
        View findViewById2 = this.f36206d.findViewById(R.id.iv_player_panel_feature);
        AbstractC3159y.h(findViewById2, "playerUi.findViewById(R.….iv_player_panel_feature)");
        ImageView imageView = (ImageView) findViewById2;
        this.f36208f = imageView;
        C2710g c2710g = new C2710g();
        this.f36204b = c2710g;
        this.f36205c = customPlayerUi;
        AbstractC3159y.f(c2710g);
        youTubePlayer.a(c2710g);
        m(imageView, youTubePlayer);
        m(findViewById, youTubePlayer);
    }

    private final void m(View view, final InterfaceC2541e interfaceC2541e) {
        view.setOnClickListener(new View.OnClickListener() { // from class: n5.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C3480h.n(InterfaceC2541e.this, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(InterfaceC2541e youTubePlayer, View view) {
        AbstractC3159y.i(youTubePlayer, "$youTubePlayer");
        youTubePlayer.play();
    }

    @Override // e2.AbstractC2577a, e2.c
    public void j(InterfaceC2541e youTubePlayer, EnumC2540d state) {
        AbstractC3159y.i(youTubePlayer, "youTubePlayer");
        AbstractC3159y.i(state, "state");
        super.j(youTubePlayer, state);
        if (state == EnumC2540d.PLAYING) {
            this.f36208f.setVisibility(8);
        } else {
            this.f36208f.setVisibility(0);
        }
    }

    public final ImageView l() {
        return this.f36208f;
    }
}
