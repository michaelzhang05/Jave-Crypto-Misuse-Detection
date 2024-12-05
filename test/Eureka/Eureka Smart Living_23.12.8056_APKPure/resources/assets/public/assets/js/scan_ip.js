function getIPUsingRTC() {
  return new Promise((resolve, reject) => {
    // NOTE: window.RTCPeerConnection is "not a constructor" in FF22/23
    var RTCPeerConnection = webkitRTCPeerConnection || window.webkitRTCPeerConnection || window.mozRTCPeerConnection;

    if (RTCPeerConnection) (() => {
      var rtc = new RTCPeerConnection({ iceServers: [] });
      if (1 || RTCPeerConnection) {      // FF [and now Chrome!] needs a channel/stream to proceed
        rtc.createDataChannel('', { negotiated: false});
      }

      rtc.onicecandidate = (evt) => {
        // convert the candidate to SDP so we can run it through our general parser
        // see https://twitter.com/lancestout/status/525796175425720320 for details
        if (evt.candidate) grepSDP("a=" + evt.candidate.candidate);
      };
      rtc.createOffer().then((offerDesc) => {
        grepSDP(offerDesc.sdp);
        rtc.setLocalDescription(offerDesc);
      });//, (e) => { console.warn("offer failed", e); });


      var addrs = Object.create(null);
      addrs["0.0.0.0"] = false;
      function updateDisplay(newAddr) {
        if (newAddr in addrs) return;
        else addrs[newAddr] = true;
        var displayAddrs = Object.keys(addrs).filter(function (k) { return addrs[k]; });
        if (displayAddrs.length > 0) {
          console.error(displayAddrs);
          return resolve(displayAddrs[0]);
        }
        return resolve(undefined);
        //document.getElementById('list').textContent = displayAddrs.join(" or perhaps ") || "n/a";
      }

      function grepSDP(sdp) {
        var hosts = [];
        sdp.split('\r\n').forEach(function (line) { // c.f. http://tools.ietf.org/html/rfc4566#page-39
          if (~line.indexOf("a=candidate")) {     // http://tools.ietf.org/html/rfc4566#section-5.13
            let parts = line.split(' '),        // http://tools.ietf.org/html/rfc5245#section-15.1
              addr = parts[4],
              type = parts[7];
            if (type === 'host') updateDisplay(addr);
          } else if (~line.indexOf("c=")) {       // http://tools.ietf.org/html/rfc4566#section-5.7
            let parts = line.split(' '),
              addr = parts[2];
            updateDisplay(addr);
          }
        });
      }

    })(); else {
      return reject(undefined);
    }
  });
}

