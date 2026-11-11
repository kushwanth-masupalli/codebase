const API_KEY ="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";

async function testNvidiaKey() {
    try {
        const response = await fetch(
            "https://integrate.api.nvidia.com/v1/chat/completions",
            {
                method: "POST",
                headers: {
                    "Authorization": `Bearer ${API_KEY}`,
                    "Content-Type": "application/json"
                },
                body: JSON.stringify({
                    model: "meta/llama-3.1-8b-instruct",
                    messages: [
                        {
                            role: "user",
                            content: "Say hello"
                        }
                    ],
                    max_tokens: 20
                })
            }
        );

        const data1 = await response.json();

        if (response.ok) {
            console.log("✅ NVIDIA API KEY WORKS");
            console.log(data1.choices?.[0]?.message?.content);
        } else {
            console.log("❌ NVIDIA API KEY FAILED");
            console.log("HTTP Status:", response.status);
            console.log(data1);
        }
    } catch (error) {
        console.error("❌ Request failed:", error.message);
    }
}

testNvidiaKey();