module br.com.devcave.java9.boleto.repository {
    requires transitive br.com.devcave.java9.boleto.domain;
    requires jdk.incubator.httpclient;
    exports br.com.devcave.java9.boleto.repository;
}