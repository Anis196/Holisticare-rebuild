// emotionChatApi.ts
// Send emotion and message to generative AI chat API

export async function sendEmotionChat(message: string, emotion: string) {
  try {
    const response = await fetch('http://localhost:8080/api/emotion/chat', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
      },
      body: JSON.stringify({ message, emotion }),
    });
    if (!response.ok) throw new Error(`HTTP error! status: ${response.status}`);
    return await response.json();
  } catch (error) {
    console.error('Failed to fetch response:', error);
    throw error;
  }
}
