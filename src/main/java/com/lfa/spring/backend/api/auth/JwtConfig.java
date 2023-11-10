package com.lfa.spring.backend.api.auth;

public class JwtConfig {

    public static final String LLAVE_SECRETA = "alguna.clave.secreta.12345678";


    public static final String RSA_PRIVADA ="-----BEGIN RSA PRIVATE KEY-----\n" +
            "MIIEogIBAAKCAQEAuBBtnWnqZYrPStYalB7zmq7Vt+R5ptvKuHjpTpNjOvHuOyeb\n" +
            "sxXtYQq18pALfxohArvl6snSaPnv+gFO5epEwenuPN2c+aenpRI7c/EKEOVDL1J9\n" +
            "qz72/ZhfBQDmg63fqi/83sC2Q9U88LH5xhDrghEiLcFUhlAAgcRDIJnUahpgNNNN\n" +
            "Q9+FteWmg98ADF3owEHmV+8MmYYdyme32VUaME3NdYlfNGaLpS/1hWlMaBq3uiZs\n" +
            "QRIrPYRJmqzo5SL5cjFKXjDAtHm3LyZEpHuLW2oBs7nSj1Gc33+RYNgSQBt6YTpz\n" +
            "gEJ8nwlQi6Xqtjy1l9X5243xe5+UatfMjxZudwIDAQABAoIBAEjoQPL0LCMye29y\n" +
            "JS78n5Nqoz7m4gTk1ISDaC52lPyZLbsCslqaWd9xZaaBxfv/donlsWlxrcVlEtgd\n" +
            "QooxZDDHH1W+lloRPYdWFHSVSl5s4VLSQvLcyuqiOyj5NVV9PrXjsi7teISf5zaT\n" +
            "2JLKyu5HKRmklX1qHPlJqykzpX6s7evt3dKDNNwEK/+55W7eOBxSUFR9LkR2FHxU\n" +
            "Q7TXlCp6GrELVL8qLNxWdbqcBq7D1kAGl1JgE34H6biYDTBE/h/4UMsu6OFafJMD\n" +
            "xyt2+zRzcs0kocqbjjL8Vhs3WP1qwmadVRAjh/CR7jA0xaZ4opX2UJWG3XC6H1cg\n" +
            "vdpbJ/ECgYEA2s3elIYo4GInjBIry0HiYw0DnHhCPPYa0u6n5UuEhHN90eRQAE6r\n" +
            "e0RkDRFDIfgSBLKe9jhMnIsgfI7MRUg4GWkPVXeNbj3A4ItXHANYAtlBSfzokcRE\n" +
            "2XxVH4lFUPC9bwjwASoEYXGm/2EIQCYWftDW7BbXGuxx9+v5WhbnyvkCgYEA11q1\n" +
            "tTJtLCTwShPCKjOpOLvtYva/E85VdYkre3viJgYK9DqMopfVeS7psJEV80Nxr9hu\n" +
            "Y6H1onBcmreU9miee4QD12FC51LXbh7etXPDe8XQUx5wnnADVlxiseh7SsZP1dx1\n" +
            "wy2x/YMkiS36p1iEPqkqZoP1NDC6IUz6ToC7cO8CgYAVpBsJsaNFXi/vKLTwK5oK\n" +
            "lfTveu2CPg01I6mzgh6fQxUEt4I6JY3MaV1D9ZsgNvsBP/F9BOB+8zvJVg5aI+R4\n" +
            "ju2XVHXGm5ECJIX/HU2NKpPMj5kpIbJ1mFiK//a9JLJ30vh6BP/d63HK/HvmbF35\n" +
            "OQqo2zF3Vj+Hd+13vaA7cQKBgDOmN8pba7+YpGC/2GOSvFU1DTwc/brcU7a6zUjy\n" +
            "b0y7SklE+ZHNZI+J5tZIFcGgPVX1TJRstaLd2/fna7ylXs003k77rrYYMj7g/Hz8\n" +
            "ZLf8u3gT5uK47rP5uFn+7gMDCQa7tyq2fOfWWh7kfidAnYcBv3+Sym5X+WwfMDE/\n" +
            "wrTVAoGAI5+oijYyNy8YynXP8MZV71yrX7zXi+pAlKq2pwlS/VhI1LU9IKyWLpfg\n" +
            "DopmZ0U2lY1a0MyOZbxfvzvDuHPQF7Uu/q1uuuUOZHFjbk17qwT0UW80CwQbAO1h\n" +
            "zHtdHZaacP2GPEjPDPOdeWGsT7Dg7k1E1uLrPinTAaGORhV/XuU=\n" +
            "-----END RSA PRIVATE KEY-----";

    public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\n" +
            "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAuBBtnWnqZYrPStYalB7z\n" +
            "mq7Vt+R5ptvKuHjpTpNjOvHuOyebsxXtYQq18pALfxohArvl6snSaPnv+gFO5epE\n" +
            "wenuPN2c+aenpRI7c/EKEOVDL1J9qz72/ZhfBQDmg63fqi/83sC2Q9U88LH5xhDr\n" +
            "ghEiLcFUhlAAgcRDIJnUahpgNNNNQ9+FteWmg98ADF3owEHmV+8MmYYdyme32VUa\n" +
            "ME3NdYlfNGaLpS/1hWlMaBq3uiZsQRIrPYRJmqzo5SL5cjFKXjDAtHm3LyZEpHuL\n" +
            "W2oBs7nSj1Gc33+RYNgSQBt6YTpzgEJ8nwlQi6Xqtjy1l9X5243xe5+UatfMjxZu\n" +
            "dwIDAQAB\n" +
            "-----END PUBLIC KEY-----";


}
