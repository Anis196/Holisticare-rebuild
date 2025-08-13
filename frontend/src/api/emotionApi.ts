// emotionApi.ts
// Fetch emotion data from Python backend

export async function getEmotionData() {
  try {
    const response = await fetch('http://localhost:8080/api/emotion/detect');
    if (!response.ok) throw new Error(`HTTP error! status: ${response.status}`);
    return await response.json();
  } catch (error) {
    console.error('Error fetching emotion data:', error);
    throw error;
  }
}
